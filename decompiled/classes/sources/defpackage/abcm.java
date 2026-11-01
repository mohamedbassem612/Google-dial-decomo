package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class abcm implements defpackage.afah {
    public final /* synthetic */ android.content.Context a;

    /* JADX WARN: Type inference failed for: r0v3, types: [abcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ajcq, java.lang.Object] */
    @Override // defpackage.afah
    public final void a() {
        if (ft$.ExternalSyntheticApiModelOutline0.m()) {
            return;
        }
        android.content.Context context = this.a;
        defpackage.acxg acxgVar = new defpackage.acxg(new defpackage.acxg((byte[]) null));
        defpackage.zvj zvjVar = defpackage.zvj.STARTUP;
        boolean zK = acxgVar.k(context, zvjVar);
        defpackage.aihd aihdVar = (defpackage.aihd) acxgVar.b;
        if (!aihdVar.isEmpty()) {
            abcu abcuVar = new abcu();
            abcuVar.b = context;
            abcuVar.a = zvjVar;
            abcuVar.c = acxgVar.a;
            abcv abcvVarA = abcuVar.a();
            defpackage.aigf aigfVarG = defpackage.acxg.g();
            afpl afplVar = new afpl((ajxi) null);
            defpackage.ailj it = aihdVar.iterator();
            while (it.hasNext()) {
                zvl zvlVar = (zvl) it.next();
                if (aigfVarG.containsKey(zvlVar)) {
                    defpackage.ahyn ahynVarF = defpackage.acxg.f((java.lang.Class) aigfVarG.get(zvlVar));
                    if (ahynVarF.f()) {
                        afplVar.J(new abct("startup_" + zvlVar.a(), zvlVar, (zvz) null, (abcq) ahynVarF.b(), abct.a));
                    } else {
                        acxgVar.h(abcvVarA.b, zvlVar, abcvVarA.a);
                    }
                } else {
                    acxgVar.j(abcvVarA.b, zvlVar, abcvVarA.a);
                }
            }
            akwb akwbVarK = afplVar.K(abcvVarA);
            try {
                akwbVarK.a.get();
            } catch (java.lang.InterruptedException | java.lang.RuntimeException | java.util.concurrent.ExecutionException unused) {
                acxgVar.i(context, zwa.a, defpackage.zvj.STARTUP);
            }
            if (!zK && !akwbVarK.b) {
                return;
            }
        } else if (!zK) {
            return;
        }
        android.util.Log.i("AppDoctorModule", "Ran some fixes at process startup.");
    }
}
