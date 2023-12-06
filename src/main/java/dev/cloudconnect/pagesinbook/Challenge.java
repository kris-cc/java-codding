package dev.cloudconnect.pagesinbook;

/**
 * Suppose that you add all the page numbers in a book. If the total is 21, the book could only have 6 pages because
 * 1 + 2 + 3 + 4 + 5 + 6 = 21. If I had said the total were 25, that would be impossible because the next number in
 * the series is 28 (21 + 7).
 *
 * Create a function that, given the total number of pages as an argument, returns true if it is a valid total
 * and false if it is not.
 *
 * Can you devise a solution that is more efficient than simply adding consecutive integers as I did above?
 *
 * Examples
 * pagesInBook(21) ➞ false
 * pagesInBook(4005) ➞ true
 * pagesInBook(9453) ➞ true
 *
 * Solution:
 *
 * sum(n) = s = n(n+1)/2 = (n^2 + n)/2 -> 2s = n^2 + n -> 0 = n^2 + n - 2s
 * a=1, b=1, c=-2s
 *
 * d = b^2 - 4ac
 * n1 = (-b - sqr(d))/2a
 * n2 = (-b + sqr(d))/2a
 *
 * So for s = 21 -> 2*21 = n^2 + n -> 0 = n^2 + n - 42
 * a=1, b=1, c=-42
 * d = 1^2 - 4*1*(-42) = 1 + 168 = 169
 *
 * n1 = (-1 - sqr(169))/(2 * 1)
 * n2 = (-1 + sqr(169))/(2 * 1)
 *
 */
public class Challenge {

    public static void main(String[] args) {
        System.out.println(pagesInBook(21));
    }

    public static boolean pagesInBook(final int total) {
        int delta = 1 - 4 * 1 * (total * -2);
        // double n1 = (-1 - Math.sqrt(delta))/(2 * 1); in this case this one is always negative, so it can't be number of pages
        double n2 = (-1 + Math.sqrt(delta))/(2 * 1);

        return n2 % 1 == 0.0;
    }
}
