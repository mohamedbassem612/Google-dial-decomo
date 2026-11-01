package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adhb extends defpackage.adhw {
    public final java.lang.String a;
    public final java.lang.String b;
    private volatile transient java.lang.String d;

    public adhb(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null namespace");
        }
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.b = str2;
    }

    @Override // defpackage.adhw
    public final java.lang.String a() {
        return this.b;
    }

    @Override // defpackage.adhw
    public final java.lang.String b() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adhw) {
            defpackage.adhw adhwVar = (defpackage.adhw) obj;
            if (this.a.equals(adhwVar.b()) && this.b.equals(adhwVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // defpackage.adhw
    public final java.lang.String toString() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = defpackage.adhw.f(this.a, this.b);
                    if (this.d == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.d;
    }
}
