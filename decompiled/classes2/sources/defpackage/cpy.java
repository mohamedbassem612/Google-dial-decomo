package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cpy {
    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    public static final android.graphics.Path.Direction b(int i) {
        return i + (-1) != 0 ? android.graphics.Path.Direction.CW : android.graphics.Path.Direction.CCW;
    }

    public static final android.graphics.Shader c(long j, long j2, java.util.List list, java.util.List list2, int i) {
        d(list, list2);
        return defpackage.cqm.a.a(j, j2, e(list), list2 != null ? ajsz.cl(list2) : null, i);
    }

    public static final void d(java.util.List list, java.util.List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new java.lang.IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new java.lang.IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final long[] e(java.util.List list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = cdh.p(((cqg) list.get(i)).a);
        }
        return jArr;
    }

    public static final defpackage.ni f() {
        return new defpackage.ni(new android.graphics.PathMeasure(), (byte[]) null);
    }
}
