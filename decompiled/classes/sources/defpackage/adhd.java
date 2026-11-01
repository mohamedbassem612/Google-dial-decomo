package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adhd extends defpackage.adib {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private volatile transient java.lang.String e;

    public adhd(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override // defpackage.adib
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.adib
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.adib
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.adib
    public final boolean d() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adib) {
            defpackage.adib adibVar = (defpackage.adib) obj;
            if (this.a == adibVar.d() && this.b == adibVar.b() && this.c == adibVar.c() && this.d == adibVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237);
    }

    @Override // defpackage.adib
    public final java.lang.String toString() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = defpackage.adik.a(true != this.a ? 2 : 1, true != this.b ? 2 : 1, true != this.c ? 2 : 1, true == this.d ? 1 : 2);
                    if (this.e == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.e;
    }
}
