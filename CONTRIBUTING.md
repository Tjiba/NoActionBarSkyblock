# Contributing to NoActionBarSkyblock

Thank you for your interest in contributing to NoActionBarSkyblock!

## 🛠️ Development Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Tjiba/NoActionBarSkyblock.git
   cd NoActionBarSkyblock
   ```

2. **Open in IntelliJ IDEA:**
   - File → Open → Select the project folder
   - IntelliJ will automatically detect it as a Gradle project
   - Wait for Gradle to sync dependencies

3. **Run the mod in development:**
   ```bash
   gradlew runClient
   ```

## 📝 Code Style

- Use **4 spaces** for indentation
- Follow **Java naming conventions**
- Add **comments** for complex logic
- Use **SLF4J** for logging (not printStackTrace)
- Keep methods **small and focused**

## 🧪 Testing

Before submitting a PR:
1. Run `gradlew build` - ensure it compiles without errors
2. Test in-game with `/nab` command and ModMenu config
3. Check that config saves/loads correctly
4. Verify no console errors

## 🐛 Reporting Bugs

Please include:
- Minecraft version
- Fabric Loader version
- Fabric API version
- Steps to reproduce
- Crash report (if applicable)

## 💡 Suggesting Features

Open an issue with:
- Clear description of the feature
- Use case / why it's needed
- Mockups / examples (if applicable)

## 📜 License

By contributing, you agree that your contributions will be licensed under the MIT License.

## 🙏 Thank You!

Every contribution helps make this mod better for the Hypixel Skyblock community!
