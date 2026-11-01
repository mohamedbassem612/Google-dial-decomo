package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acfb extends defpackage.ahxq {
    @Override // defpackage.ahxq
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        akhh akhhVar = (akhh) obj;
        defpackage.akzx akzxVarM = aksc.a.m();
        if ((akhhVar.b & 1) != 0) {
            java.lang.String str = akhhVar.c;
            akzxVarM.u();
            aksc akscVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akscVar.b |= 1;
            akscVar.c = str;
        }
        if ((akhhVar.b & 2) != 0) {
            long j = akhhVar.d;
            akzxVarM.u();
            aksc akscVar2 = akzxVarM.b;
            akscVar2.b |= 2;
            akscVar2.d = j;
        }
        if ((akhhVar.b & 4) != 0) {
            long j2 = akhhVar.e;
            akzxVarM.u();
            aksc akscVar3 = akzxVarM.b;
            akscVar3.b |= 4;
            akscVar3.e = j2;
        }
        if ((akhhVar.b & 8) != 0) {
            defpackage.akzc akzcVar = akhhVar.f;
            akzxVarM.u();
            aksc akscVar4 = akzxVarM.b;
            j$.util.Objects.requireNonNull(akzcVar);
            akscVar4.b |= 8;
            akscVar4.f = akzcVar;
        }
        return akzxVarM.r();
    }

    @Override // defpackage.ahxq
    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        aksc akscVar = (aksc) obj;
        defpackage.akzx akzxVarM = akhh.a.m();
        if ((akscVar.b & 1) != 0) {
            java.lang.String str = akscVar.c;
            akzxVarM.u();
            akhh akhhVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akhhVar.b |= 1;
            akhhVar.c = str;
        }
        if ((akscVar.b & 2) != 0) {
            long j = akscVar.d;
            akzxVarM.u();
            akhh akhhVar2 = akzxVarM.b;
            akhhVar2.b |= 2;
            akhhVar2.d = j;
        }
        if ((akscVar.b & 4) != 0) {
            long j2 = akscVar.e;
            akzxVarM.u();
            akhh akhhVar3 = akzxVarM.b;
            akhhVar3.b |= 4;
            akhhVar3.e = j2;
        }
        if ((akscVar.b & 8) != 0) {
            defpackage.akzc akzcVar = akscVar.f;
            akzxVarM.u();
            akhh akhhVar4 = akzxVarM.b;
            j$.util.Objects.requireNonNull(akzcVar);
            akhhVar4.b |= 8;
            akhhVar4.f = akzcVar;
        }
        return akzxVarM.r();
    }
}
