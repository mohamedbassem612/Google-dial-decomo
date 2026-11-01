package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqn extends defpackage.aeql {
    public static final defpackage.aeqn a = new defpackage.aeqn();

    @Override // defpackage.aeql
    public final /* synthetic */ defpackage.albh a(java.lang.String str, java.lang.Object obj) {
        return defpackage.agab.bo(str, aa$.ExternalSyntheticApiModelOutline1.m(obj));
    }

    @Override // defpackage.aeql
    public final /* synthetic */ defpackage.albh b(defpackage.albh albhVar, defpackage.albh albhVar2) {
        return defpackage.agab.bn((defpackage.apeq) albhVar, (defpackage.apeq) albhVar2);
    }

    @Override // defpackage.aeql
    public final /* bridge */ /* synthetic */ java.lang.String c(defpackage.albh albhVar) {
        defpackage.apeq apeqVar = (defpackage.apeq) albhVar;
        defpackage.apel apelVar = apeqVar.e;
        if (apelVar == null) {
            apelVar = defpackage.apel.a;
        }
        if ((apelVar.b & 2) != 0) {
            defpackage.apel apelVar2 = apeqVar.e;
            if (apelVar2 == null) {
                apelVar2 = defpackage.apel.a;
            }
            return apelVar2.d;
        }
        defpackage.apel apelVar3 = apeqVar.e;
        if (apelVar3 == null) {
            apelVar3 = defpackage.apel.a;
        }
        return java.lang.Long.toHexString(apelVar3.c);
    }
}
