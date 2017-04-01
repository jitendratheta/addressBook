package com.test;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by jitendra.k on 01/04/17.
 */
public class FastScanner {

    BufferedReader br;
    StringTokenizer st;

    /**
     * Instantiates a new Fast scanner.
     *
     * @param stream the stream
     */
    public FastScanner(InputStream stream) {
        br = new BufferedReader(new InputStreamReader(stream));
    }

    /**
     * Instantiates a new Fast scanner.
     *
     * @param name the name
     */
    public FastScanner(String name) {
        try {
            br = new BufferedReader(new FileReader(name));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Next token string.
     *
     * @return the string
     */
    public String nextToken() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    /**
     * Next string.
     *
     * @return the string
     */
    public String next() {
        return nextToken();
    }

    /**
     * Next int int.
     *
     * @return the int
     */
    public int nextInt() {
        return Integer.parseInt(nextToken());
    }

    /**
     * Next long long.
     *
     * @return the long
     */
    public long nextLong() {
        return Long.parseLong(nextToken());
    }

    /**
     * Next double double.
     *
     * @return the double
     */
    public double nextDouble() {
        return Double.parseDouble(nextToken());
    }

    /**
     * Next string string.
     *
     * @return the string
     */
    public String nextString() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }

    /**
     * Next line string.
     *
     * @return the string
     */
    public String nextLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}