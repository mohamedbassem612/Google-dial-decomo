package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hyw {
    private static final aimz d = aimz.i("com/android/dialer/audio/impl/AudioMulticasterV2");
    public final ajct b;
    public final aiii a = new aidf((byte[]) null);
    private j$.util.Optional e = j$.util.Optional.empty();
    public final java.util.Set c = new acc(0);
    private j$.util.Optional f = j$.util.Optional.empty();

    public hyw(ajcu ajcuVar) {
        this.b = ajcuVar;
    }

    public final void a(java.lang.String str, defpackage.hzb hzbVar) {
        lpb.b();
        boolean z = true;
        if (this.e.isPresent() && !((defpackage.hzh) this.e.orElseThrow()).equals(hzbVar.e)) {
            z = false;
        }
        ahvr.bZ(z, "already have tee with different audio source type");
        this.a.t(str, hzbVar);
        this.e = j$.util.Optional.of(hzbVar.e);
    }

    public final void b(defpackage.hzb hzbVar) {
        lpb.b();
        aicz aiczVar = this.a;
        new aicy(aiczVar).remove(hzbVar);
        if (aiczVar.w()) {
            this.e = j$.util.Optional.empty();
            this.f = j$.util.Optional.empty();
            j$.lang.Iterable.-EL.forEach(this.c, new defpackage.fch(9));
        }
    }

    public final void c(j$.util.Optional optional) {
        lpb.b();
        if (this.f.isPresent() && !optional.equals(this.f)) {
            d.b().l("com/android/dialer/audio/impl/AudioMulticasterV2", "setSourceFormat", 97, "AudioMulticasterV2.java").I("format changed from %s to %s, removing all tees", this.f, optional);
            ailj ailjVarK = aihd.o(new aicy(this.a)).k();
            while (ailjVarK.hasNext()) {
                ((defpackage.hzb) ailjVarK.next()).d(defpackage.hxb.c);
            }
        }
        this.f = optional;
    }

    public final void d(akzc akzcVar) {
        akzc akzcVarX;
        int iC;
        lpb.b();
        ailj ailjVarK = aihd.o(new aicy(this.a)).k();
        while (ailjVarK.hasNext()) {
            defpackage.hzb hzbVar = (defpackage.hzb) ailjVarK.next();
            ahoq ahoqVarW = ahvr.W(93, "AudioTeeImpl_write");
            try {
                lpb.b();
                if (akzcVar.c() > hzbVar.c) {
                    defpackage.hzb.a.d().i(zct.b).l("com/android/dialer/audio/impl/AudioTeeImpl", "write", 172, "AudioTeeImpl.java").v("write size overflows buffer");
                }
                defpackage.hzg hzgVar = hzbVar.g;
                lpb lpbVar = hzgVar.b;
                lpb.b();
                int iC2 = akzcVar.c();
                int i = hzgVar.a;
                if (iC2 > i) {
                    iC = akzcVar.c() - i;
                    akzcVarX = akzcVar.x(akzcVar.c() - i);
                } else {
                    akzcVarX = akzcVar;
                    iC = 0;
                }
                java.util.Queue queue = hzgVar.c;
                if (queue.size() + akzcVarX.c() > i) {
                    int size = (queue.size() + akzcVarX.c()) - i;
                    iC += size;
                    for (int i2 = 0; i2 < size; i2++) {
                        queue.remove();
                    }
                }
                j$.util.Objects.requireNonNull(queue);
                j$.lang.Iterable.-EL.forEach(akzcVarX, new defpackage.fcg(queue, 4));
                if (hzgVar.d.isPresent() && queue.size() >= hzgVar.e) {
                    ajdd ajddVar = (ajdd) hzgVar.d.orElseThrow();
                    hzgVar.d = j$.util.Optional.empty();
                    ajddVar.o(hzgVar.a(hzgVar.e));
                }
                if (iC > 0) {
                    defpackage.hzb.a.d().i(zct.b).l("com/android/dialer/audio/impl/AudioTeeImpl", "write", 176, "AudioTeeImpl.java").v("overflow");
                }
                hzbVar.h += iC;
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

    public final boolean e() {
        return !this.a.w();
    }
}
