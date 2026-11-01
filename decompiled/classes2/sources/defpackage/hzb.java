package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hzb {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/AudioTeeImpl");
    public android.media.AudioFormat b;
    public int c;
    public defpackage.hwy d;
    public final defpackage.hzh e;
    public int f;
    public defpackage.hzg g;
    private final j$.time.Duration j;
    private final defpackage.hyy k;
    private final aigf l;
    private final ajcu m;
    private final defpackage.hgw o;
    private final java.util.concurrent.atomic.AtomicReference n = new java.util.concurrent.atomic.AtomicReference(defpackage.hza.a);
    public int h = 0;
    public j$.util.Optional i = j$.util.Optional.empty();

    public hzb(defpackage.hzh hzhVar, j$.time.Duration duration, defpackage.hyy hyyVar, aigf aigfVar, ajcu ajcuVar, defpackage.hgw hgwVar) {
        this.e = hzhVar;
        this.j = duration;
        this.k = hyyVar;
        this.l = aigfVar;
        this.m = ajcuVar;
        this.o = hgwVar;
    }

    public final ajcq a(defpackage.hxa hxaVar, ajct ajctVar) {
        int i = 1;
        defpackage.ibg ibgVar = new defpackage.ibg(this, i);
        ajcu ajcuVar = this.m;
        return ahrv.g(ahvr.G(ibgVar, ajcuVar)).h(new defpackage.hup(this, 2), ajcuVar).h(new defpackage.hup(hxaVar, 3), ajctVar).i(new defpackage.juo(this, hxaVar, ajctVar, i), ajcuVar);
    }

    public final ajcq b(int i, defpackage.hxa hxaVar, ajct ajctVar) {
        ajcq ajcqVar;
        ahoq ahoqVarW = ahvr.W(91, "AudioTeeImpl_read");
        try {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.n;
            if (atomicReference.get() == defpackage.hza.d) {
                j$.util.Optional optionalOfNullable = this.i;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(aiql.z(optionalOfNullable.get()));
                }
                ajcqVar = (ajcq) optionalOfNullable.orElseThrow(new defpackage.iaz(1));
            } else {
                ahvr.bZ(anty.Q(atomicReference, defpackage.hza.b, defpackage.hza.c), "read() cannot be called twice");
                ahvr.bZ(i % 2 == 0, "read size must be a multiple of 2");
                this.f = i;
                ajcq ajcqVarA = a(hxaVar, ajctVar);
                ajcqVarA.c(new defpackage.gra(this, (defpackage.hyw) this.l.get(this.e), 16), this.m);
                ahoqVarW.a(ajcqVarA);
                ajcqVar = ajcqVarA;
            }
            ahoqVarW.close();
            return ajcqVar;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [aoin, java.lang.Object] */
    public final void c() {
        a.b().l("com/android/dialer/audio/impl/AudioTeeImpl", "initialize", 117, "AudioTeeImpl.java").v("initialize");
        ahoq ahoqVarW = ahvr.W(90, "AudioTeeImpl_initialize");
        try {
            lpb.b();
            ahvr.bZ(anty.Q(this.n, defpackage.hza.a, defpackage.hza.b), "already initialized");
            defpackage.hyy hyyVar = this.k;
            defpackage.hzh hzhVar = this.e;
            hyyVar.a(hzhVar);
            lpb.b();
            defpackage.hzl hzlVar = (defpackage.hzl) hyyVar.e.get(hzhVar);
            if (hzlVar == null) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("no active AudioSource for the given AudioSourceType: %s", hzhVar));
            }
            this.b = hzlVar.a();
            lpb.b();
            ahvr.bZ(hyyVar.g.isPresent(), "audio mode not set");
            this.d = (defpackage.hwy) hyyVar.g.orElseThrow();
            int sampleRate = this.b.getSampleRate();
            android.media.AudioFormat audioFormat = this.b;
            if (audioFormat.getEncoding() != 2) {
                throw new java.lang.UnsupportedOperationException("unsupported format ".concat(java.lang.String.valueOf(java.lang.String.valueOf(audioFormat))));
            }
            int millis = ((sampleRate << 1) * ((int) this.j.toMillis())) / 1000;
            this.c = millis;
            lpb lpbVar = (lpb) this.o.a.a();
            lpbVar.getClass();
            this.g = new defpackage.hzg(millis, lpbVar);
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(defpackage.hxb hxbVar) {
        ahoq ahoqVarW = ahvr.W(92, "AudioTeeImpl_stop");
        try {
            lpb.b();
            if (!this.i.isPresent()) {
                java.util.concurrent.atomic.AtomicReference atomicReference = this.n;
                defpackage.hza hzaVar = defpackage.hza.d;
                ahvr.bZ(atomicReference.getAndSet(hzaVar) != hzaVar, "Tee stopped twice");
                a.b().l("com/android/dialer/audio/impl/AudioTeeImpl", "stop", 206, "AudioTeeImpl.java").v("enter stop");
                this.i = j$.util.Optional.of(hxbVar);
                ((defpackage.hyw) this.l.get(this.e)).b(this);
                this.g.b();
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
