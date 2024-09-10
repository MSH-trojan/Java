# Java_21_JList_Test_1

JLists are used for:

1 - Series of items

2 - user can select one or more items

3 - Single-selection vs. multiple-selection

4 - Using class JList

## overview:

This Java program demonstrates the use of a JList component in a Swing-based GUI application. 

The program allows users to select a color from a list, and the background of the window will change to the selected color.

The list is implemented using the JList class and is displayed within a JScrollPane for easy navigation.

## Features:

A list of color names is presented to the user in a scrollable format.

The user can select a single color at a time.

Upon selection, the background color of the window changes to match the selected color.

## Components Used

JList: To display the list of color names.

JScrollPane: To allow scrolling through the list.

Container: To manage the layout and components.

ListSelectionListener: To handle the event of a user selecting an item from the list.

## How It Works

The list of color names (colorNames[]) is defined as a String array.

A corresponding array of Color objects (colors[]) holds the actual color values for each name.

The JList is populated with the color names and set to allow only single selections.

The ListSelectionListener is implemented using an anonymous inner class, which listens for item 
selections.

When an item is selected, the background color of the window changes to the corresponding color 
from the colors[] array.

The list is embedded in a JScrollPane for better usability when there are multiple options.

