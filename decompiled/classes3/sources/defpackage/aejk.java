package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aejk {
    public final aigf a;
    private final boolean b;
    private final aigf c;

    public aejk(boolean z, aigf aigfVar, aigf aigfVar2) {
        this.b = z;
        this.c = aigfVar;
        this.a = aigfVar2;
    }

    public static boolean a(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        return context.getTheme().resolveAttribute(2130969600, typedValue, true) && typedValue.data != 0;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00b7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static aigf b(android.content.Context r7) {
        /*
            aejj[] r0 = defpackage.aejj.values()
            int r1 = r0.length
            int[] r2 = new int[r1]
            r3 = 0
            r4 = r3
        L9:
            if (r4 >= r1) goto L14
            r5 = r0[r4]
            int r5 = r5.g
            r2[r4] = r5
            int r4 = r4 + 1
            goto L9
        L14:
            r1 = 0
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r1, r2)
            java.util.EnumMap r2 = new java.util.EnumMap
            java.lang.Class<aejj> r4 = defpackage.aejj.class
            r2.<init>(r4)
        L20:
            int r4 = r0.length     // Catch: java.lang.UnsupportedOperationException -> Lb5 java.lang.Throwable -> Lb7
            if (r3 >= r4) goto L3d
            r4 = r0[r3]     // Catch: java.lang.UnsupportedOperationException -> Lb5 java.lang.Throwable -> Lb7
            android.content.res.Resources r5 = r7.getResources()     // Catch: java.lang.UnsupportedOperationException -> Lb5 java.lang.Throwable -> Lb7
            int r6 = r4.h     // Catch: java.lang.UnsupportedOperationException -> Lb5 java.lang.Throwable -> Lb7
            int r5 = r5.getColor(r6)     // Catch: java.lang.UnsupportedOperationException -> Lb5 java.lang.Throwable -> Lb7
            int r5 = r1.getColor(r3, r5)     // Catch: java.lang.UnsupportedOperationException -> Lb5 java.lang.Throwable -> Lb7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.UnsupportedOperationException -> Lb5 java.lang.Throwable -> Lb7
            r2.put(r4, r5)     // Catch: java.lang.UnsupportedOperationException -> Lb5 java.lang.Throwable -> Lb7
            int r3 = r3 + 1
            goto L20
        L3d:
            r1.recycle()
            java.util.Set r7 = r2.entrySet()
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L51
            aigf r7 = aikj.b
            goto Lb4
        L51:
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Enum r1 = (java.lang.Enum) r1
            java.lang.Object r0 = r0.getValue()
            ahvr.bB(r1, r0)
            java.util.EnumMap r2 = new java.util.EnumMap
            java.util.Map r0 = java.util.Collections.singletonMap(r1, r0)
            r2.<init>(r0)
        L6d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Enum r1 = (java.lang.Enum) r1
            java.lang.Object r0 = r0.getValue()
            ahvr.bB(r1, r0)
            r2.put(r1, r0)
            goto L6d
        L8a:
            int r7 = r2.size()
            if (r7 == 0) goto Lb2
            r0 = 1
            if (r7 == r0) goto L99
            aifq r7 = new aifq
            r7.<init>(r2)
            goto Lb4
        L99:
            java.util.Set r7 = r2.entrySet()
            java.lang.Object r7 = ahvr.bm(r7)
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r0 = r7.getKey()
            java.lang.Enum r0 = (java.lang.Enum) r0
            java.lang.Object r7 = r7.getValue()
            aigf r7 = aigf.k(r0, r7)
            goto Lb4
        Lb2:
            aigf r7 = aikj.b
        Lb4:
            return r7
        Lb5:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r7 = move-exception
            r1.recycle()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aejk.b(android.content.Context):aigf");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aejk) {
            defpackage.aejk aejkVar = (defpackage.aejk) obj;
            if (this.b == aejkVar.b && this.c.equals(aejkVar.c) && ahvr.aJ(this.a, aejkVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "OneGoogleColorResolver{isLightTheme=" + this.b + ", colorsMap=" + this.c.toString() + ", googleThemedColorsMap=" + ahvr.aF(this.a) + '}';
    }

    public aejk() {
        throw null;
    }
}
