package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abcu {
    public zvj a;
    public android.content.Context b;
    public abcp c;
    public aify d;
    public aify e;
    public final java.util.Map f;
    public defpackage.abct g;
    public boolean h;
    public boolean i;

    public abcu(defpackage.abcv abcvVar) {
        this.a = zvj.a;
        this.e = aike.a;
        this.f = new java.util.HashMap();
        this.a = abcvVar.a;
        this.b = abcvVar.b;
        this.c = abcvVar.c;
        this.d = abcvVar.d;
        this.e = abcvVar.e;
        aify aifyVarG = abcvVar.f.c().g();
        for (int i = 0; i < aifyVarG.size(); i++) {
            defpackage.abcr abcrVar = (defpackage.abcr) aifyVarG.get(i);
            this.f.put(abcrVar.a, abcrVar);
        }
        this.g = abcvVar.g;
        this.h = abcvVar.h;
        this.i = abcvVar.i;
    }

    public final defpackage.abcv a() {
        ahvr.bZ(this.a != zvj.a, "Entry Point must be set.");
        if (this.c == null) {
            android.util.Log.w("AppDoctorFixerContext", "No AppDoctorLogger set.");
            this.c = new defpackage.abcy();
        }
        return new defpackage.abcv(this);
    }

    public final void b(defpackage.abcr abcrVar) {
        this.f.put(abcrVar.a, abcrVar);
    }

    public final void c() {
        this.i = true;
    }

    public final void d() {
        this.h = true;
    }

    public final void e(defpackage.abcq abcqVar, int i) {
        int i2;
        java.util.Map map = this.f;
        defpackage.zvl zvlVar = abcqVar.a;
        if (!map.containsKey(zvlVar)) {
            throw new java.lang.IllegalArgumentException("Status of '" + abcqVar.b() + "' cannot be updated since no original status was set.");
        }
        int i3 = i - 2;
        if (i3 != 2) {
            i2 = i3 != 4 ? 3 : 6;
        } else {
            i2 = 5;
        }
        b(new defpackage.abcr(zvlVar, i2));
    }

    public abcu() {
        this.a = zvj.a;
        this.e = aike.a;
        this.f = new java.util.HashMap();
        this.d = null;
    }
}
