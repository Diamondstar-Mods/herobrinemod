# Herobrine Mod

A Minecraft mod that brings the legendary Herobrine entity and related features to your world. This mod adds a new dimension, custom biomes, entities, blocks, items, and more to enhance your gameplay with horror and adventure elements.

## Features

### Entities
- **HerobrineBoss**: The main boss entity. Spawns with a spawn egg and drops diamond blocks upon defeat. Plays custom sounds when hurt and has unique death procedures.
- **HerobrinePassive**: A passive version of Herobrine that avoids players. Spawns naturally and has a custom name.
- **HerobrineLoader**: An entity that spawns other Herobrine-related mobs. Includes debug spawning options controlled by game rules.

### Blocks
- **That Face**: A custom block that can be crafted or found. Has a loot table for dropping the item version.
- **Restart Fight**: A block that triggers a procedure when right-clicked, allowing players to restart encounters.
- **Herobrine Dimension Portal**: A portal block for traveling to the Herobrine Dimension. Created using the Herobrine Dimension item.

### Items
- **Herobrine Spawn Egg**: Spawns the HerobrineBoss entity.
- **HerobrinePassive Spawn Egg**: Spawns the HerobrinePassive entity.
- **HerobrineLoader Spawn Egg**: Spawns the HerobrineLoader entity.
- **That Face**: An item dropped from the That Face block.
- **Herobrine Dimension** (Lighter): An item used to create portals to the Herobrine Dimension. Right-click to ignite portals.
- **You Shouldn't Do That** (Cheater Item): A special item that triggers warnings or effects when used, simulating cheating consequences.

### Dimensions
- **Herobrine Dimension**: A custom dimension with unique properties, including no precipitation, custom ambient sounds (boss theme), and a multi-noise biome source. Features custom trees, carvers, and fluid (That Face fluid).

### Biomes
- **Herobrienbiome**: A custom biome within the Herobrine Dimension. Features no precipitation, custom colors (foliage, grass, sky, fog, water), and spawns no monsters by default. Includes custom tree features and carvers.

### World Generation
- Custom configured features for biome trees, including trunk, foliage, and decorators.
- Placed features for biome trees with specific placement rules.
- Biome modifiers to add spawns for HerobrineLoader in any biome.

### Sounds
- **Boss Theme**: Ambient sound played in the Herobrine Dimension.
- **Steve Hit Sounds**: Custom hit sounds for entities, with multiple variations.

### Game Rules
- **Debug Mode**: A boolean game rule to enable debug features.
- **Herobrine Loader Spawn Debug**: An integer game rule controlling debug spawning for HerobrineLoader.

### Procedures and Behaviors
- **HerobrineLoader On Initial Entity Spawn**: Executes commands or effects when the loader spawns.
- **Herobrine Entity Is Hurt**: Plays sounds and triggers effects when Herobrine is damaged.
- **Herobrine Entity Dies**: Drops items and executes death procedures.
- **Herobrine On Initial Entity Spawn**: Sets up initial spawn behaviors.
- **HerobrinePassive On Initial Entity Spawn**: Sets custom name to "Herobrine".
- **Restart Fight On Block Rightclicked**: Procedure triggered by right-clicking the Restart Fight block.
- **You Shouldn't Do That Rightclicked**: Procedure for the cheater item.

### Other
- Custom loot tables for entities and blocks.
- Dimension effects with custom fog, water, and sky colors.
- Teleporter logic for the Herobrine Dimension portals.
- Tree decorators for custom tree generation in the biome.

## Installation

1. Ensure you have Minecraft Forge or NeoForge installed (compatible with the mod's version).
2. Download the mod JAR file from Modrinth.
3. Place the JAR file in your `mods` folder.
4. Launch Minecraft and enjoy!

## Usage

- Spawn Herobrine entities using spawn eggs or natural spawning.
- Craft or find blocks and items to explore the Herobrine Dimension.
- Use the Herobrine Dimension item to create portals.
- Adjust game rules for debugging or custom experiences.

## Compatibility

- Requires NeoForge.
- Compatible with Minecraft version [insert version, e.g., 1.21.x] (check mod details on Modrinth).

## Credits

Created using MCreator. Inspired by Minecraft legends.

## License

[Insert license, e.g., MIT or as per your mod's license]