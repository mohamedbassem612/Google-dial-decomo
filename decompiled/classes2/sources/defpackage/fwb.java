package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fwb implements java.lang.Comparable {
    public final defpackage.fwc a;
    public final android.os.Bundle b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final int f = -1;

    public fwb(defpackage.fwc fwcVar, android.os.Bundle bundle, boolean z, int i, boolean z2) {
        this.a = fwcVar;
        this.b = bundle;
        this.c = z;
        this.d = i;
        this.e = z2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r6.e != false) goto L29;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(defpackage.fwb r6) {
        /*
            r5 = this;
            java.lang.String r0 = "other"
            aooh.f(r6, r0)
            boolean r0 = r5.c
            r1 = 1
            r2 = -1
            if (r0 == 0) goto L10
            boolean r0 = r6.c
            if (r0 == 0) goto L53
            goto L14
        L10:
            boolean r0 = r6.c
            if (r0 != 0) goto L4e
        L14:
            int r0 = r5.d
            int r3 = r6.d
            int r0 = r0 - r3
            if (r0 > 0) goto L53
            if (r0 < 0) goto L4e
            android.os.Bundle r0 = r5.b
            if (r0 == 0) goto L3d
            android.os.Bundle r3 = r6.b
            if (r3 == 0) goto L53
            int r0 = r0.size()
            android.os.Bundle r3 = r6.b
            aooh.c(r3)
            java.lang.String r4 = "source"
            aooh.f(r3, r4)
            int r3 = r3.size()
            int r0 = r0 - r3
            if (r0 > 0) goto L53
            if (r0 < 0) goto L4e
            goto L41
        L3d:
            android.os.Bundle r0 = r6.b
            if (r0 != 0) goto L4e
        L41:
            boolean r5 = r5.e
            if (r5 == 0) goto L4a
            boolean r5 = r6.e
            if (r5 != 0) goto L50
            goto L53
        L4a:
            boolean r5 = r6.e
            if (r5 == 0) goto L50
        L4e:
            r1 = r2
            goto L53
        L50:
            int r5 = r6.f
            r1 = 0
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwb.compareTo(fwb):int");
    }
}
