package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class appp implements java.lang.Comparable {
    public static final java.lang.String a;
    public final appb b;

    static {
        java.lang.String str = java.io.File.separator;
        aooh.e(str, "separator");
        a = str;
    }

    public appp(appb appbVar) {
        aooh.f(appbVar, "bytes");
        this.b = appbVar;
    }

    public final java.lang.Character a() {
        char cA;
        appb appbVar = defpackage.apqj.a;
        appb appbVar2 = appb.a;
        appb appbVar3 = this.b;
        if (appbVar3.d(appbVar, 0) != -1 || appbVar3.c() < 2 || appbVar3.a(1) != 58 || (((cA = (char) appbVar3.a(0)) < 'a' || cA >= '{') && (cA < 'A' || cA >= '['))) {
            return null;
        }
        return java.lang.Character.valueOf(cA);
    }

    public final java.util.List b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iB = defpackage.apqj.b(this);
        if (iB == -1) {
            iB = 0;
        } else {
            appb appbVar = this.b;
            if (iB < appbVar.c() && appbVar.a(iB) == 92) {
                iB++;
            }
        }
        appb appbVar2 = this.b;
        int iC = appbVar2.c();
        int i = iB;
        while (iB < iC) {
            int i2 = iB + 1;
            if (appbVar2.a(iB) == 47 || appbVar2.a(iB) == 92) {
                arrayList.add(appbVar2.j(i, iB));
                i = i2;
            }
            iB = i2;
        }
        if (i < appbVar2.c()) {
            arrayList.add(appbVar2.j(i, appbVar2.c()));
        }
        return arrayList;
    }

    public final defpackage.appp c() {
        int iB = defpackage.apqj.b(this);
        if (iB == -1) {
            return null;
        }
        return new defpackage.appp(this.b.j(0, iB));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.appp apppVar = (defpackage.appp) obj;
        aooh.f(apppVar, "other");
        return this.b.b(apppVar.b);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.appp) && aooh.n(((defpackage.appp) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return this.b.i();
    }
}
