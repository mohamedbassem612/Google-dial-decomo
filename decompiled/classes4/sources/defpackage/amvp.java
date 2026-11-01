package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvp extends anar {
    static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '$', ':', '/', '.', '+', 'A', 'B', 'C', 'D'};
    static final int[] b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    static boolean a(char[] cArr, char c) {
        if (cArr == null) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (cArr[i] == c) {
                return true;
            }
        }
        return false;
    }
}
