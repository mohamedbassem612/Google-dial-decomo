package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aeoe implements defpackage.aeob {
    public aeoe(aeof aeofVar) {
        j$.util.Objects.requireNonNull(aeofVar);
    }

    @Override // defpackage.aeob
    public final boolean a(akzx akzxVar) {
        akzx akzxVarM = defpackage.aenv.a.m();
        akzx akzxVarM2 = defpackage.aenw.a.m();
        alcf alcfVarE = aldi.e(j$.time.Instant.now().toEpochMilli() - (android.os.SystemClock.elapsedRealtime() - aa$.ExternalSyntheticApiModelOutline1.m()));
        akzxVarM2.u();
        defpackage.aenw aenwVar = (defpackage.aenw) akzxVarM2.b;
        j$.util.Objects.requireNonNull(alcfVarE);
        aenwVar.c = alcfVarE;
        aenwVar.b |= 1;
        akzxVarM.u();
        defpackage.aenv aenvVar = (defpackage.aenv) akzxVarM.b;
        defpackage.aenw aenwVar2 = (defpackage.aenw) akzxVarM2.p();
        j$.util.Objects.requireNonNull(aenwVar2);
        aenvVar.c = aenwVar2;
        aenvVar.b = 2;
        akzxVar.aA(akzxVarM);
        return true;
    }
}
