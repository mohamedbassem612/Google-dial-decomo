package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alji implements defpackage.aljg {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/TimingAudioInputRunner");
    private ajcu d;
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    private j$.util.Optional e = j$.util.Optional.empty();
    private j$.util.Optional f = j$.util.Optional.empty();
    public j$.util.Optional c = j$.util.Optional.empty();

    @Override // defpackage.aljg
    public final int a() {
        j$.util.Optional optionalOfNullable = this.f;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(((defpackage.aliv) optionalOfNullable.get()).a()));
        }
        return ((java.lang.Integer) optionalOfNullable.orElse(0)).intValue();
    }

    @Override // defpackage.aljg
    public final void c(java.io.InputStream inputStream) {
        j$.util.Optional optionalOfNullable = this.e;
        defpackage.allq allqVar = new defpackage.allq(this, inputStream, 1, null);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj = optionalOfNullable.get();
            java.lang.Object obj2 = allqVar.b;
            optionalOfNullable = j$.util.Optional.ofNullable(new defpackage.aliv((java.io.InputStream) allqVar.a, (defpackage.alqg) obj, new defpackage.aljh((defpackage.alji) obj2, 0)));
        }
        defpackage.aliv alivVar = (defpackage.aliv) optionalOfNullable.orElseThrow(new defpackage.ahuq(6));
        this.f = j$.util.Optional.of(alivVar);
        aiql.I(this.d.eU(new afgu(this, alivVar, 15)), new jya(this, 20), this.d);
    }

    @Override // defpackage.aljg
    public final void d() {
        this.b.set(true);
        this.f = j$.util.Optional.empty();
    }

    @Override // defpackage.aljg
    public final void e(java.lang.String str, aizr aizrVar, defpackage.alqg alqgVar, ajcu ajcuVar, defpackage.amgv amgvVar) {
        this.e = j$.util.Optional.of(alqgVar);
        this.d = ajcuVar;
        this.b.set(false);
    }

    @Override // defpackage.aljg
    public final void f(aprf aprfVar) {
        this.c = j$.util.Optional.of(aprfVar);
    }

    @Override // defpackage.aljg
    public final void b() {
    }
}
