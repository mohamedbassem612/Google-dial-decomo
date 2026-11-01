package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gsz {
    public boolean a;
    public java.util.UUID b;
    public defpackage.gxl c;
    public final java.util.Set d;
    private final java.lang.Class e;

    public gsz(java.lang.Class cls) {
        if (cls == null) {
            defpackage.aooh.i("workerClass");
        }
        this.e = cls;
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        defpackage.aooh.e(uuidRandomUUID, "randomUUID(...)");
        this.b = uuidRandomUUID;
        java.lang.String string = this.b.toString();
        defpackage.aooh.e(string, "toString(...)");
        java.lang.String name = cls.getName();
        defpackage.aooh.e(name, "getName(...)");
        if (string == null) {
            defpackage.aooh.i("id");
        }
        if (name == null) {
            defpackage.aooh.i("workerClassName_");
        }
        this.c = new defpackage.gxl(string, (defpackage.gsw) null, name, (java.lang.String) null, (defpackage.grp) null, (defpackage.grp) null, 0L, 0L, 0L, (defpackage.grn) null, 0, (defpackage.grj) null, 0L, 0L, 0L, 0L, false, (defpackage.gss) null, 0, 0L, 0, 0, (java.lang.String) null, (java.lang.Boolean) null, 33554426);
        java.lang.String[] strArr = {cls.getName()};
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(defpackage.ajsz.aL(1));
        defpackage.ajsz.dk(strArr, linkedHashSet);
        this.d = linkedHashSet;
    }

    public abstract defpackage.aogc a();

    public final void b(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("tag");
        }
        this.d.add(str);
    }

    public final void c(defpackage.grj grjVar, long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.aooh.f(timeUnit, "timeUnit");
        this.a = true;
        defpackage.gxl gxlVar = this.c;
        gxlVar.m = grjVar;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            defpackage.gsh.a();
            android.util.Log.w(defpackage.gxl.a, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            defpackage.gsh.a();
            android.util.Log.w(defpackage.gxl.a, "Backoff delay duration less than minimum value");
        }
        gxlVar.n = defpackage.aooc.y(millis, 10000L, 18000000L);
    }

    public final void d(defpackage.grn grnVar) {
        if (grnVar == null) {
            defpackage.aooh.i("constraints");
        }
        this.c.k = grnVar;
    }

    public final void e(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (timeUnit == null) {
            defpackage.aooh.i("timeUnit");
        }
        this.c.h = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - java.lang.System.currentTimeMillis() <= this.c.h) {
            throw new java.lang.IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void f(defpackage.grp grpVar) {
        if (grpVar == null) {
            defpackage.aooh.i("inputData");
        }
        this.c.f = grpVar;
    }

    public final defpackage.aogc g() {
        defpackage.aogc aogcVarA = a();
        defpackage.grn grnVar = this.c.k;
        boolean z = grnVar.b() || grnVar.f || grnVar.d || grnVar.e;
        defpackage.gxl gxlVar = this.c;
        if (gxlVar.r) {
            if (z) {
                throw new java.lang.IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (gxlVar.h > 0) {
                throw new java.lang.IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        java.lang.String str = gxlVar.y;
        if (str == null) {
            java.util.List listS = defpackage.aoov.S(gxlVar.d, new java.lang.String[]{"."}, 0);
            java.lang.String strAa = listS.size() == 1 ? (java.lang.String) listS.get(0) : (java.lang.String) defpackage.ajsz.bI(listS);
            if (strAa.length() > 127) {
                strAa = defpackage.aoov.aa(strAa, 127);
            }
            gxlVar.y = strAa;
        } else if (str.length() > 127) {
            gxlVar.y = defpackage.aoov.aa(str, 127);
        }
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        defpackage.aooh.e(uuidRandomUUID, "randomUUID(...)");
        if (uuidRandomUUID == null) {
            defpackage.aooh.i("id");
        }
        this.b = uuidRandomUUID;
        java.lang.String string = uuidRandomUUID.toString();
        defpackage.aooh.e(string, "toString(...)");
        defpackage.gxl gxlVar2 = this.c;
        if (string == null) {
            defpackage.aooh.i("newId");
        }
        if (gxlVar2 == null) {
            defpackage.aooh.i("other");
        }
        this.c = new defpackage.gxl(string, gxlVar2.c, gxlVar2.d, gxlVar2.e, new defpackage.grp(gxlVar2.f), new defpackage.grp(gxlVar2.g), gxlVar2.h, gxlVar2.i, gxlVar2.j, new defpackage.grn(gxlVar2.k), gxlVar2.l, gxlVar2.m, gxlVar2.n, gxlVar2.o, gxlVar2.p, gxlVar2.q, gxlVar2.r, gxlVar2.s, gxlVar2.t, gxlVar2.v, gxlVar2.w, gxlVar2.x, gxlVar2.y, gxlVar2.z, 524288);
        return aogcVarA;
    }
}
