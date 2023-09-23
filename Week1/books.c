#include <stdio.h>
#include <string.h>

struct Book {
    char title[100];
    char author[50];
    int edition;
    float cost;
    int numCopies;
};

void addBook(struct Book books[], int *numBooks) {
    if (*numBooks < 100) {
        struct Book newBook;
        printf("Enter details of the book:\n");
        printf("Title: ");
        scanf(" %[^\n]", newBook.title);
        printf("Author: ");
        scanf(" %[^\n]", newBook.author);
        printf("Edition: ");
        scanf("%d", &newBook.edition);
        printf("Cost: ");
        scanf("%f", &newBook.cost);
        printf("Number of copies: ");
        scanf("%d", &newBook.numCopies);

        books[*numBooks] = newBook;
        (*numBooks)++;
        printf("Book added successfully!\n");
    } else {
        printf("Maximum limit of books reached.\n");
    }
}

void searchBook(struct Book books[], int numBooks) {
    char searchTitle[100];
    printf("Enter the title of the book to search: ");
    scanf(" %[^\n]", searchTitle);

    int found = 0;
    for (int i = 0; i < numBooks; i++) {
        if (strcmp(books[i].title, searchTitle) == 0) {
            printf("Book found!\n");
            printf("Title: %s\n", books[i].title);
            printf("Author: %s\n", books[i].author);
            printf("Edition: %d\n", books[i].edition);
            printf("Cost: %.2f\n", books[i].cost);
            printf("Number of copies: %d\n", books[i].numCopies);
            found = 1;
            break;
        }
    }
    if (!found) {
        printf("Book not found.\n");
    }
}

void editBook(struct Book books[], int numBooks) {
    char searchTitle[100];
    printf("Enter the title of the book to edit: ");
    scanf(" %[^\n]", searchTitle);

    for (int i = 0; i < numBooks; i++) {
        if (strcmp(books[i].title, searchTitle) == 0) {
            printf("Enter new details for the book:\n");
            printf("Author: ");
            scanf(" %[^\n]", books[i].author);
            printf("Edition: ");
            scanf("%d", &books[i].edition);
            printf("Cost: ");
            scanf("%f", &books[i].cost);
            printf("Number of copies: ");
            scanf("%d", &books[i].numCopies);
            printf("Book details updated!\n");
            return;
        }
    }
    printf("Book not found.\n");
}

void deleteBook(struct Book books[], int *numBooks) {
    char searchTitle[100];
    printf("Enter the title of the book to delete: ");
    scanf(" %[^\n]", searchTitle);

    for (int i = 0; i < *numBooks; i++) {
        if (strcmp(books[i].title, searchTitle) == 0) {
            for (int j = i; j < (*numBooks) - 1; j++) {
                books[j] = books[j + 1];
            }
            (*numBooks)--;
            printf("Book deleted successfully!\n");
            return;
        }
    }
    printf("Book not found.\n");
}

int main() {
    struct Book books[100];
    int numBooks = 0;
    int choice;

    do {
        printf("\nMenu:\n");
        printf("1. Add a book\n");
        printf("2. Search a book\n");
        printf("3. Edit details of a book\n");
        printf("4. Delete a book\n");
        printf("5. End the program\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                addBook(books, &numBooks);
                break;
            case 2:
                searchBook(books, numBooks);
                break;
            case 3:
                editBook(books, numBooks);
                break;
            case 4:
                deleteBook(books, &numBooks);
                break;
            case 5:
                printf("Exiting the program.\n");
                break;
            default:
                printf("Invalid choice. Please select a valid option.\n");
        }
    } while (choice != 5);

    return 0;
}
