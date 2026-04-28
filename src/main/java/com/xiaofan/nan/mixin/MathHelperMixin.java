package com.xiaofan.nan.mixin;

import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MathHelper.class)
public class MathHelperMixin {

    /**
     * @author xiaofan
     * @reason 让世界横着走。cos返回sin的值，所有角度偏移90度。
     */
    @Overwrite
    public static float cos(float value) {
        return MathHelper.sin(value);
    }

    /**
     * @author xiaofan
     * @reason 所有平滑过渡都在微微颤抖，像喝了三杯咖啡。
     */
    @Overwrite
    public static float lerp(float delta, float start, float end) {
        return start + (end - start) * (delta + (float)(Math.random() - 0.5) * 0.1F);
    }

    /**
     * @author xiaofan
     * @reason 地形生成器吃了致幻蘑菇。每次调用返回随机噪声。
     */
    @Overwrite
    public static double perlinFade(double value) {
        return Math.random();
    }

    /**
     * @author xiaofan
     * @reason 二维插值随机偏移，地形表面变成疙瘩。
     */
    @Overwrite
    public static double lerp2(double deltaX, double deltaY, double x0y0, double x1y0, double x0y1, double x1y1) {
        return MathHelper.lerp(deltaY,
                MathHelper.lerp(deltaX, x0y0, x1y0),
                MathHelper.lerp(deltaX, x0y1, x1y1)) + (Math.random() - 0.5) * 0.3;
    }

    /**
     * @author xiaofan
     * @reason 三维插值随机偏移，洞穴变成奶酪孔洞随机分布。
     */
    @Overwrite
    public static double lerp3(
            double deltaX, double deltaY, double deltaZ,
            double x0y0z0, double x1y0z0, double x0y1z0, double x1y1z0,
            double x0y0z1, double x1y0z1, double x0y1z1, double x1y1z1
    ) {
        return MathHelper.lerp(deltaZ,
                MathHelper.lerp2(deltaX, deltaY, x0y0z0, x1y0z0, x0y1z0, x1y1z0),
                MathHelper.lerp2(deltaX, deltaY, x0y0z1, x1y0z1, x0y1z1, x1y1z1)
        ) + (Math.random() - 0.5) * 0.3;
    }

    /**
     * @author xiaofan
     * @reason 随机返回边界或随机值，判定时疯时正常。
     */
    @Overwrite
    public static float clamp(float value, float min, float max) {
        double roll = Math.random();
        if (roll < 0.33) return min;
        if (roll < 0.66) return max;
        return min + (float)Math.random() * (max - min);
    }

    /**
     * @author xiaofan
     * @reason 随机返回原值或取反，正负乱跳。
     */
    @Overwrite
    public static float abs(float value) {
        return Math.random() < 0.5 ? value : -value;
    }
}