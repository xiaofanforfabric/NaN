# NaN - Minecraft Math Destruction Experiment / 数学崩溃实验

> ⚠️ **WARNING / 严重警告：This mod will completely break your Minecraft. Not intended for normal gameplay. / 这个模组会让你的 Minecraft 彻底疯掉。不适用于正常游玩。**

---

## What is this? / 这是什么

NaN is an experimental Fabric mod that overwrites core mathematical functions in `MathHelper` using minimal Mixin code, twisting Minecraft's world into an indescribable Cthulhu dimension.

NaN 是一个实验性 Fabric 模组，用极少的 Mixin 代码覆盖 `MathHelper` 中的核心数学函数，将 Minecraft 的世界扭曲成一个不可名状的克苏鲁维度。

**7 `@Overwrite` annotations. Total annihilation. / 7个 `@Overwrite`，毁灭一切。**

---

## Effects / 效果展示

| System / 系统            | Symptom / 症状                                                    |
|------------------------|-----------------------------------------------------------------|
| Player Movement / 玩家移动 | W walks backward, S walks forward / 按W后退，按S前进                   |
| Sun & Moon / 日月轨迹      | Sun rises from the north / 太阳从北方升起                              |
| Selection Box / 选择框    | Crosshair aims forward, box offset to the right / 准星指前方，选择框歪到右边 |
| Terrain / 地形           | Random-height spiked pillars, honeycomb chaos / 随机高度针板柱，Y轴蜂窝乱码  |
| Caves / 洞穴             | Random internal cheese-like holes / 内部结构随机奶酪化                   |
| Animations / 动画        | All smooth transitions jitter like Parkinson's / 所有平滑过渡帕金森抽搐    |
| Camera / 视角            | Micro-tremors when moving / 移动时画面微颤                             |
| Textures / 纹理          | UV coordinates jitter / UV坐标抖动                                  |
| Block Detection / 方块判定 | Sometimes normal, sometimes insane / 随机时正常时疯                    |
| Numeric Sign / 数值正负    | Randomly flips positive/negative / 随机取反                         |
| Loading Screen / 加载界面  | Progress bar jumps erratically / 进度条跳大神                         |

---
## Bonus Feature / 附加功能

### `/pos` Command / 传送命令

Teleport yourself into the void of mathematical impossibility.

把你自己送进数学的不可能深渊。

| Command / 命令       | Effect / 效果                                                                                |
|--------------------|--------------------------------------------------------------------------------------------|
| `/pos nan nan nan` | Become one with NaN. Coordinates cease to exist. / 化身NaN，坐标不复存在                            |
| `/pos inf inf inf` | Ascend to infinity. The game will try to calculate the incalculable. / 飞升至无穷，游戏将尝试计算不可计算之物 |
| `/pos <x> <y> <z>` | Teleport to any coordinate. No limits. No safety. / 传送到任意坐标，没有限制，没有安全                      |

**In a world where math is already broken, this command is the final nail in the coffin. / 在一个数学已经崩溃的世界里，这个命令是棺材上的最后一颗钉子。**



## How it works / 技术原理

Uses Mixin to overwrite methods in `net.minecraft.util.math.MathHelper`:

通过 Mixin 覆盖 `net.minecraft.util.math.MathHelper` 中的方法：

| Method / 方法  | Modification / 改动                            | Impact / 影响                             |
|--------------|----------------------------------------------|-----------------------------------------|
| `cos`        | Returns `sin(value)` / 返回sin值                | All angles shift by 90° / 所有角度偏移90度     |
| `lerp`       | Delta + random ±5% / delta加随机抖动              | All smooth animations jitter / 所有平滑动画抽搐 |
| `perlinFade` | Returns `Math.random()` / 返回纯随机              | Terrain Y-axis pure random / 地形Y轴纯随机    |
| `lerp2`      | Result + random ±0.15 / 结果加随机偏移              | Terrain surface lumpy / 地形表面疙瘩化         |
| `lerp3`      | Result + random ±0.15 / 结果加随机偏移              | Cave structure randomized / 洞穴结构随机化     |
| `clamp`      | Randomly returns min/max/random / 随机返回边界或随机值 | Block detection chaotic / 方块判定时疯时正常     |
| `abs`        | Randomly flips sign / 随机取反                   | Positive/negative values chaos / 正负乱跳   |

---

## Why "NaN"? / 为什么叫 NaN

NaN stands for **Not a Number** in computing — produced when a mathematical operation has no definable result. This mod turns Minecraft's mathematical foundation into NaN.

NaN 在计算机中代表 **Not a Number（不是数字）**——当一个数学运算的结果无法被定义时就会产生 NaN。这个模组让 Minecraft 的数学基础变成了 NaN。

---

## Installation / 安装

1. Install Fabric Loader 0.15.0+ / 安装 Fabric Loader
2. Install Fabric API / 安装 Fabric API
3. Place this mod in your `mods` folder / 将本模组放入 `mods` 文件夹
4. Launch the game / 启动游戏
5. Create a new world / 新建世界
6. Embrace the madness / 拥抱疯狂

---

## Compatibility / 兼容性

- Minecraft 1.20.1
- Requires Fabric API / 需要 Fabric API
- Incompatible with other mods that modify `MathHelper` (if any exist) / 与其他修改 `MathHelper` 的模组不兼容
- **DO NOT use on any world you care about / 不要在任何你在乎的存档中使用**

---

## ⚠️ Known Issues / 已知问题

### Stability / 稳定性
**Stability: It's in God's hands. / 看老天爷脸色。**

The world may generate successfully, or it may crash with a beautifully chaotic crash report. Certain seeds and biomes are more prone to explosions than others. You have been warned.

世界可能成功生成，也可能随时给你生成一份错误报告当纪念品。某些种子和生物群系比其他地方更容易爆炸。别怪我没提醒你。

### Performance / 效率
**Patience is mandatory. / 慢慢等吧。**

World creation takes at least 5 minutes. The loading progress bar will jump erratically between 3% and 100% like an electrocardiogram on caffeine. If a Mojang developer saw that log, they would cry.

创建世界至少需要5分钟起步。加载进度条会在3%到100%之间来回横跳，像喝了咖啡的心电图。Mojang 开发人员看了日志都要哭。

**Don't trust the progress bar. It lies. / 别信进度条。它嘴里没一句实话。**

---

## Use cases / 用途

- 🎬 Record absurd gameplay videos / 拍摄离谱的游戏视频
- 🔬 Study Minecraft's underlying math architecture / 研究 Minecraft 底层数学架构
- 🌌 Experience Lovecraftian cosmic horror / 体验洛夫克拉夫特式宇宙恐怖
- 🏆 Prove "minimal code, maximal chaos" / 证明"最少代码，最大后果"

---

## Inspiration / 灵感来源

This mod was directly inspired by B站UP主 **灵夜风和** and their amazing video that shows the beautiful chaos of breaking Minecraft's math.

本模组的灵感直接来源于 B站UP主 **灵夜风和** 的精彩视频，展现了打破 Minecraft 数学逻辑的美丽混沌。

- **UP主主页 / Creator's page:** [https://space.bilibili.com/448042510](https://space.bilibili.com/448042510)
- **灵感视频 / Inspiration video:** [https://www.bilibili.com/video/BV1jyu9zsESW/](https://www.bilibili.com/video/BV1jyu9zsESW/)

> 正如灵夜风和在他的置顶评论中所言，改变 Minecraft 的数学逻辑并非易事。直接修改所有底层方法会导致爆栈或数组越界，最终只能精准地改动几个关键函数，并小心翼翼地保证数值浮动范围一致。这种在崩溃边缘试探的艺术，正是本模组试图延续的精神。

Special thanks also to **普通の史蒂夫**, whose work inspired 灵夜风和's video and, in turn, this mod.

同样感谢 **普通の史蒂夫**，他的作品启发了灵夜风和的视频，并间接促成了这个模组。

---

## License / 许可证

MIT License — Do whatever you want. Don't blame me. / 想干嘛干嘛，出事别找我。

---

## Credits / 致谢

- **灵夜风和** — The inspiration behind this whole disaster / 这场灾难的灵感来源
- **普通の史蒂夫** — The spark that lit the first fire / 点燃第一把火的火花
- Mojang — Made Minecraft, the perfect sandbox to break / 造了 Minecraft，这个完美的破坏沙盒
- Fabric Team — Made Mixin, the scalpel we use to dissect the game / 造了 Mixin 这把解剖游戏的手术刀
- All the crash reports along the way — You taught us the limits / 一路上的每一个崩溃报告 — 是你们教会了我们边界在哪

---

*"One line of code, and the world collapses. The fewest lines, the maximum destruction in Minecraft modding history." / "一行代码，万物崩塌。这是 Minecraft 混元历史上代码量最少、破坏范围最大的 Mod。"*