package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apkd implements defpackage.apqc {
    public final defpackage.apqc a;
    public final defpackage.appa b;
    public final defpackage.apoz c;

    public apkd(defpackage.apqc apqcVar) {
        this.a = apqcVar;
        defpackage.apqd apqdVar = ((defpackage.apqm) apqcVar).c;
        if (apqdVar == null) {
            defpackage.aooh.i("<this>");
        }
        this.b = new defpackage.appx(apqdVar);
        defpackage.apqb apqbVar = ((defpackage.apqm) apqcVar).d;
        if (apqbVar == null) {
            defpackage.aooh.i("<this>");
        }
        this.c = new defpackage.appv(apqbVar);
    }

    @Override // defpackage.apqc
    public final /* synthetic */ defpackage.apqb a() {
        return this.c;
    }

    @Override // defpackage.apqc
    public final /* synthetic */ defpackage.apqd b() {
        return this.b;
    }
}
