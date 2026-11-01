package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acnl implements defpackage.aclv, defpackage.acni {
    public final defpackage.aiwd a;
    public final java.util.List b;
    public final defpackage.acmf c;
    public final long d = -1;
    public final boolean e;

    public acnl(defpackage.aiwd aiwdVar, java.util.List list, defpackage.acmf acmfVar, long j, boolean z) {
        this.a = aiwdVar;
        this.b = list;
        this.c = acmfVar;
        this.e = z;
    }

    @Override // defpackage.acni
    public final /* synthetic */ defpackage.acmi a() {
        return defpackage.abrz.e(this);
    }

    @Override // defpackage.acni
    public final java.util.List b() {
        return this.b;
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        defpackage.aiwc aiwcVar = defpackage.abrz.e(this).d;
        if (aiwcVar == null) {
            aiwcVar = defpackage.aiwc.a;
        }
        ahymVarL.e("rootVeId", aiwcVar.d);
        defpackage.aiwc aiwcVar2 = defpackage.abrz.f(this).d;
        if (aiwcVar2 == null) {
            aiwcVar2 = defpackage.aiwc.a;
        }
        ahymVarL.e("targetVeId", aiwcVar2.d);
        ahymVarL.b("interaction", this.c);
        return ahymVarL.toString();
    }
}
