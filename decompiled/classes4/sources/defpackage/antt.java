package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class antt {
    public java.lang.Object a;
    public java.lang.Object b;

    public antt(defpackage.amcb amcbVar) {
        this.b = j$.util.Optional.empty();
        this.a = amcbVar.a;
        this.b = amcbVar.b;
    }

    public final defpackage.anlw a() {
        if (this.b != null) {
            this.a = new defpackage.anlw((java.util.IdentityHashMap) this.b);
            this.b = null;
        }
        return (defpackage.anlw) this.a;
    }

    public final java.util.IdentityHashMap b(int i) {
        if (this.b == null) {
            java.lang.Object obj = this.a;
            defpackage.anlw anlwVar = defpackage.anlw.a;
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap(((defpackage.anlw) obj).b.size() + i);
            this.b = identityHashMap;
            identityHashMap.putAll(((defpackage.anlw) this.a).b);
            this.a = null;
        }
        return (java.util.IdentityHashMap) this.b;
    }

    public final void c(anlv anlvVar, java.lang.Object obj) {
        b(1).put(anlvVar, obj);
    }

    public final defpackage.amcb d() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            throw new java.lang.IllegalStateException("Missing required properties: matchingParams");
        }
        return new defpackage.amcb((defpackage.amdp) obj, (j$.util.Optional) this.b);
    }

    public final void e(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null lastKeyPressed");
        }
        this.b = optional;
    }

    public final void f(defpackage.amdp amdpVar) {
        if (amdpVar == null) {
            throw new java.lang.NullPointerException("Null matchingParams");
        }
        this.a = amdpVar;
    }

    public final defpackage.alie g() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            this.b = ((aift) obj).h();
        } else if (this.b == null) {
            this.b = aike.a;
        }
        return new defpackage.alie((aify) this.b);
    }

    public antt(defpackage.anlw anlwVar) {
        this.a = anlwVar;
    }

    public antt(byte[] bArr) {
        this.b = j$.util.Optional.empty();
    }

    public antt(defpackage.alie alieVar) {
        this.b = alieVar.a;
    }
}
