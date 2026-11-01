package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acsu implements defpackage.acru {
    public static final defpackage.acsu a = new defpackage.acsu();
    private static final amnk b = amnk.b;
    private static final aku c = new aku(1.0f, 300.0f, (java.lang.Object) null);
    private static final aku d = new aku(1.0f, 300.0f, (java.lang.Object) null);
    private static final aku e = new aku(1.0f, 300.0f, (java.lang.Object) null);

    @Override // defpackage.acrs
    public final defpackage.acrc a(int i, boolean z, long j, bor borVar, aomy aomyVar, aomy aomyVar2, int i2, float f, float f2, java.util.Map map) {
        defpackage.acss acssVar;
        defpackage.acss acssVar2;
        boolean z2;
        defpackage.acss acssVar3;
        float f3;
        aooh.f(map, "overrides");
        defpackage.acss acssVar4 = defpackage.acsi.a;
        if (a.x(i, 1)) {
            if (z) {
                acssVar2 = defpackage.acsi.d;
                acssVar3 = acssVar2;
                z2 = true;
            } else {
                acssVar = defpackage.acsi.a;
                acssVar3 = acssVar;
                z2 = false;
            }
        } else if (a.x(i, 2) || a.x(i, 4)) {
            if (z) {
                acssVar2 = defpackage.acsi.e;
                acssVar3 = acssVar2;
                z2 = true;
            } else {
                acssVar = defpackage.acsi.b;
                acssVar3 = acssVar;
                z2 = false;
            }
        } else if (a.x(i, 3)) {
            if (z) {
                acssVar2 = defpackage.acsi.f;
                acssVar3 = acssVar2;
                z2 = true;
            }
            acssVar = defpackage.acsi.c;
            acssVar3 = acssVar;
            z2 = false;
        } else if (a.x(i, 5)) {
            if (z) {
                acssVar2 = defpackage.acsi.d;
                acssVar3 = acssVar2;
                z2 = true;
            }
            acssVar = defpackage.acsi.c;
            acssVar3 = acssVar;
            z2 = false;
        } else {
            z2 = z;
            acssVar3 = null;
        }
        if (acssVar3 == null) {
            return null;
        }
        ajml ajmlVar = (ajml) map.get(new defpackage.acro(i));
        long jS = ajmlVar != null ? ajmlVar.a : cfd.S();
        if (true == anty.ah(jS, cfd.S())) {
            jS = j;
        }
        cqg[] cqgVarArrAL = afsq.aL(jS, borVar, b);
        aoiu aoiuVar = (!a.x(i, 4) || cqgVarArrAL.length < 4) ? new aoiu(cqgVarArrAL[0], cqgVarArrAL[1]) : new aoiu(cqgVarArrAL[2], cqgVarArrAL[3]);
        boolean zX = a.x(i, 5);
        aomy aomyVar3 = zX ? defpackage.acsv.a : aomyVar2;
        aku akuVar = c;
        aku akuVar2 = d;
        aku akuVar3 = e;
        if (zX) {
            f3 = z2 ? 2.5f : 0.8f;
        } else {
            f3 = 0.0f;
        }
        return new defpackage.acsm(i, acssVar3, aoiuVar, aomyVar, aomyVar3, akuVar, akuVar2, akuVar3, zX, f3, i2);
    }

    @Override // defpackage.acrs
    public final boolean b() {
        return false;
    }
}
