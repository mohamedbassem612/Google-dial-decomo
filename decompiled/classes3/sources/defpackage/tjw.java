package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tjw {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;

    public tjw(char[] cArr) {
        this.a = j$.util.Optional.empty();
        this.c = j$.util.Optional.empty();
        this.d = j$.util.Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    final int a() {
        java.lang.Object obj = this.a;
        int iA = obj != null ? ((defpackage.tik) obj).a() : 0;
        java.lang.Object obj2 = this.c;
        if (obj2 != null && !((defpackage.tif) obj2).isClosed()) {
            iA += ((defpackage.tif) this.c).getCount();
        }
        java.lang.Object obj3 = this.b;
        if (obj3 != null) {
            iA += ((defpackage.thk) obj3).getCount();
        }
        return iA + this.d.size();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, tht] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tht] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tht] */
    final defpackage.tht b(int i) {
        java.lang.Object obj = this.a;
        if (obj != null) {
            int iA = i - ((defpackage.tik) obj).a();
            if (iA < 0) {
                defpackage.tik tikVar = (defpackage.tik) this.a;
                aify aifyVar = tikVar.b;
                ahvr.bY(!aifyVar.isEmpty());
                ahvr.bM(i >= 0 && i <= aifyVar.size());
                tikVar.c = i;
                return this.a;
            }
            i = iA;
        }
        java.lang.Object obj2 = this.b;
        if (obj2 != null) {
            int count = i - ((defpackage.thk) obj2).getCount();
            if (count < 0) {
                ((defpackage.thk) this.b).moveToPosition(i);
                return this.b;
            }
            i = count;
        }
        java.lang.Object obj3 = this.c;
        if (obj3 == null || i - ((defpackage.tif) obj3).getCount() >= 0) {
            throw new java.lang.IllegalStateException("No valid cursor.");
        }
        ((defpackage.tif) this.c).moveToPosition(i);
        return this.c;
    }

    public final void c(defpackage.abwd abwdVar) {
        if (abwdVar == null) {
            throw new java.lang.NullPointerException("Null photoInfo");
        }
        this.b = abwdVar;
    }

    public final void d(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null euiccEids");
        }
        this.c = aifyVar;
    }

    public tjw(short[] sArr) {
    }

    public tjw(byte[] bArr) {
        this.c = j$.util.Optional.empty();
    }

    public tjw() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = new java.util.ArrayList();
    }
}
