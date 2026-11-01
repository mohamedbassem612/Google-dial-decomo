package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afha extends defpackage.afhh {
    public static final defpackage.afhh a = new defpackage.afha();

    @Override // defpackage.afhh
    public final java.lang.String a() {
        return "singleproc";
    }

    @Override // defpackage.afhh
    public final /* synthetic */ defpackage.afhg b(defpackage.afgp afgpVar, java.lang.String str, java.util.concurrent.Executor executor, defpackage.aogc aogcVar) {
        return new defpackage.afhc(str, defpackage.aiql.z(afgpVar.a), new defpackage.afhk(afgpVar.b, afgpVar.f ? defpackage.akzq.a() : defpackage.akzq.a), executor, aogcVar, afgpVar.c, new defpackage.ahnw());
    }
}
