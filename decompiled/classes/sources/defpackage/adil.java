package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adil extends defpackage.adin {
    public final com.google.android.libraries.micore.superpacks.base.BasePriority a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    private final int g;
    private volatile transient java.lang.String h;

    public adil(com.google.android.libraries.micore.superpacks.base.BasePriority basePriority, int i, int i2, int i3, int i4, int i5) {
        this.a = basePriority;
        this.g = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    @Override // defpackage.adin
    public final int a() {
        return this.d;
    }

    @Override // defpackage.adin
    public final int b() {
        return this.b;
    }

    @Override // defpackage.adin
    public final int c() {
        return this.g;
    }

    @Override // defpackage.adin
    public final int d() {
        return this.c;
    }

    @Override // defpackage.adin
    public final int e() {
        return this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adin) {
            defpackage.adin adinVar = (defpackage.adin) obj;
            if (this.a.equals(adinVar.f()) && this.g == adinVar.c() && this.b == adinVar.b() && this.c == adinVar.d() && this.d == adinVar.a() && this.e == adinVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adin
    public final com.google.android.libraries.micore.superpacks.base.BasePriority f() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    @Override // defpackage.adin
    public final java.lang.String toString() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    this.h = "{" + defpackage.adik.a(this.g, this.b, this.c, this.d) + ", " + defpackage.adik.g(this.e) + ", p " + this.a.toString() + '}';
                    if (this.h == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }
}
