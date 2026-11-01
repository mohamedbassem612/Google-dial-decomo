package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fgo implements defpackage.fft {
    public defpackage.eqg a;
    public boolean b;
    public final defpackage.hgt c;
    private final defpackage.evq d;
    private final defpackage.fey e;
    private final rai f;

    public fgo(defpackage.evq evqVar, defpackage.flm flmVar) {
        rai raiVar = new rai(flmVar);
        defpackage.fey feyVar = new defpackage.fey();
        defpackage.hgt hgtVar = new defpackage.hgt((char[]) null);
        this.d = evqVar;
        this.f = raiVar;
        this.e = feyVar;
        this.c = hgtVar;
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [fcx] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fft
    public final /* bridge */ /* synthetic */ defpackage.ffw b(defpackage.eqt eqtVar) {
        java.lang.Object obj;
        defpackage.eqq eqqVar = eqtVar.b;
        ahvr.ci(eqqVar);
        ahvr.ci(eqqVar);
        defpackage.eqn eqnVar = eqqVar.c;
        if (eqnVar == null) {
            obj = defpackage.fcx.m;
        } else {
            defpackage.fey feyVar = this.e;
            synchronized (feyVar.a) {
                if (!j$.util.Objects.equals(eqnVar, feyVar.b)) {
                    feyVar.b = eqnVar;
                    defpackage.kvt kvtVar = new defpackage.kvt(new defpackage.evy());
                    ailj ailjVarK = eqnVar.c.e().k();
                    while (ailjVarK.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                        java.lang.String str = (java.lang.String) entry.getKey();
                        java.lang.String str2 = (java.lang.String) entry.getValue();
                        ahvr.ci(str);
                        ahvr.ci(str2);
                        ?? r8 = kvtVar.b;
                        synchronized (r8) {
                            try {
                                r8.put(str, str2);
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                    }
                    java.util.HashMap map = new java.util.HashMap();
                    java.util.UUID uuid = defpackage.epx.a;
                    java.util.UUID uuid2 = eqnVar.a;
                    int[] iArrW = aiql.W(eqnVar.g);
                    for (int i : iArrW) {
                        boolean z = true;
                        if (i != 2 && i != 1) {
                            z = false;
                        }
                        ahvr.bM(z);
                    }
                    defpackage.fcq fcqVar = new defpackage.fcq(uuid2, kvtVar, map, (int[]) iArrW.clone());
                    byte[] bArr = eqnVar.h;
                    byte[] bArrCopyOf = bArr != null ? java.util.Arrays.copyOf(bArr, bArr.length) : null;
                    ahvr.bY(fcqVar.b.isEmpty());
                    fcqVar.j = bArrCopyOf;
                    feyVar.c = fcqVar;
                }
                obj = feyVar.c;
                ahvr.ci(obj);
            }
        }
        return new defpackage.fgp(eqtVar, this.d, this.f, obj, this.b, this.a);
    }

    @Override // defpackage.fft
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.fft
    public final /* synthetic */ void d(defpackage.frr frrVar) {
    }
}
