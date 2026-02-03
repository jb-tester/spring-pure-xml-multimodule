### Multi-module Spring project with XML configuration. No Spring Boot.

1. without facet configured:
    - OK: Spring view displays the correct beans
    - BUG: Structure view does not show the injection information
    - BUG: Spring Debugger does not work
  1.1 Main module:
   - OK: main module bean classes have the correct gutter icons
   - OK: AutowireBean... action is available and suggests all beans
   - BUG: dependency generation actions are available in xml config
   - BUG: note the false-positive autowiring error for constructor set in xml
   
   1.2 Lib module:
   - BUG: no AutowireBean... action is available
   - BUG: no dependency generation actions are available in XML config
   - for the lib module classes that are defined as beans in the same (lib) module:
      - BUG: no class gutter icons are displayed
      - BUG: no xml-specific gutter icons for constructor injection, only autowiring-like ones
      - OK: gutter icons for setter injection are displayed correctly
      - OK: Structure view is available
   - for the lib module classes that are defined as beans in a different (main) module:
      - BUG: no gutter icons are displayed at all
      - BUG: no Structure view is available
      
2. configuration is not auto-detected even after adding facet
3. after configuring facet manually:
    - OK: Spring view displays the correct beans
    - BUG: Structure view does not show the injection information
    - BUG: Spring Debugger does not work
    3.1. No changes in the main module
    3.2. in the lib module:
      - BUG: class gutter icons are still not displayed
      - BUG: xml-specific gutter icons for constructor injection are still not displayed
      - BUG: no AutowireBean... action is available
      - BUG: no dependency generation actions are available in XML config
      - OK: gutter icons for setter injection are displayed correctly
      - OK: Autowiring-like gutter icons are displayed correctly for constructor injection
