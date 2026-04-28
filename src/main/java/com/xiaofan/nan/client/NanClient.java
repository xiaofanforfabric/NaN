package com.xiaofan.nan.client;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;

public class NanClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> dispatcher.register(
                ClientCommandManager.literal("pos")
                        .then(ClientCommandManager.argument("x", StringArgumentType.word())
                                .then(ClientCommandManager.argument("y", StringArgumentType.word())
                                        .then(ClientCommandManager.argument("z", StringArgumentType.word())
                                                .executes(this::executeSetPosition))))));
    }

    private int executeSetPosition(CommandContext<net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource> context) {
        ClientPlayerEntity player = context.getSource().getPlayer();
        if (player == null) {
            context.getSource().sendError(Text.literal("No local player found."));
            return 0;
        }

        String xRaw = StringArgumentType.getString(context, "x");
        String yRaw = StringArgumentType.getString(context, "y");
        String zRaw = StringArgumentType.getString(context, "z");

        try {
            double x = parseExtremeDouble(xRaw);
            double y = parseExtremeDouble(yRaw);
            double z = parseExtremeDouble(zRaw);

            // Intentionally allows NaN/Infinity for extreme local testing.
            player.setPosition(x, y, z);
            context.getSource().sendFeedback(Text.literal("Set player pos to x=" + x + ", y=" + y + ", z=" + z));
            return 1;
        } catch (NumberFormatException ex) {
            context.getSource().sendError(Text.literal("Invalid coordinate(s). Use number, NaN, Infinity, -Infinity."));
            return 0;
        }
    }

    private static double parseExtremeDouble(String raw) {
        String normalized = raw.trim();
        if ("nan".equalsIgnoreCase(normalized)) {
            return Double.NaN;
        }
        if ("infinity".equalsIgnoreCase(normalized) || "+infinity".equalsIgnoreCase(normalized)
                || "inf".equalsIgnoreCase(normalized) || "+inf".equalsIgnoreCase(normalized)) {
            return Double.POSITIVE_INFINITY;
        }
        if ("-infinity".equalsIgnoreCase(normalized) || "-inf".equalsIgnoreCase(normalized)) {
            return Double.NEGATIVE_INFINITY;
        }

        return Double.parseDouble(normalized);
    }
}
