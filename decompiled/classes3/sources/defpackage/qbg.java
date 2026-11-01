package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qbg implements zog, defpackage.zni, defpackage.znp, defpackage.zno, defpackage.znn {
    private j$.util.Optional g = j$.util.Optional.empty();
    private j$.util.Optional h = j$.util.Optional.empty();
    public j$.util.Optional a = j$.util.Optional.empty();
    public j$.util.Optional b = j$.util.Optional.empty();
    public j$.util.Optional c = j$.util.Optional.empty();
    public j$.util.Optional d = j$.util.Optional.empty();
    public j$.util.Optional e = j$.util.Optional.empty();
    public boolean f = false;

    public final /* synthetic */ int a() {
        return 0;
    }

    public final void b(android.telecom.Call.Details details) {
        this.f = details.hasProperty(8);
    }

    @Override // defpackage.znn
    public final ajcq c() {
        j$.util.Optional optional = this.a;
        defpackage.qbf qbfVar = new defpackage.qbf(this, 1);
        if (true == optional.isPresent()) {
            ((defpackage.qbg) qbfVar.a).b = j$.util.Optional.of(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - ((java.lang.Long) optional.get()).longValue()));
        }
        return ajcm.a;
    }

    @Override // defpackage.zni
    public final ajcq d() {
        if (!this.g.isPresent()) {
            this.g = j$.util.Optional.of(java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
            this.h = j$.util.Optional.of(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        }
        return ajcm.a;
    }

    @Override // defpackage.znp
    public final ajcq ek() {
        this.e = j$.util.Optional.of(java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
        j$.util.Optional optional = this.g;
        defpackage.qbf qbfVar = new defpackage.qbf(this, 0);
        if (true == optional.isPresent()) {
            ((defpackage.qbg) qbfVar.a).c = j$.util.Optional.of(java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli() - ((java.lang.Long) optional.get()).longValue()));
        }
        j$.util.Optional optional2 = this.h;
        defpackage.qbf qbfVar2 = new defpackage.qbf(this, 2);
        if (true == optional2.isPresent()) {
            ((defpackage.qbg) qbfVar2.a).d = j$.util.Optional.of(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - ((java.lang.Long) optional2.get()).longValue()));
        }
        return ajcm.a;
    }

    @Override // defpackage.zno
    public final ajcq em() {
        this.a = j$.util.Optional.of(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        return ajcm.a;
    }
}
