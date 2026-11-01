package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class esc {
    public defpackage.esb a;
    public defpackage.epu b;
    public int c;
    private final ahzi e;
    private final android.os.Handler f;
    private defpackage.esd h;
    public float d = 1.0f;
    private int g = 0;

    public esc(android.content.Context context, android.os.Looper looper, defpackage.esb esbVar) {
        this.e = ahvr.bI(new defpackage.exm(context, 1));
        this.a = esbVar;
        this.f = new android.os.Handler(looper);
    }

    public final int a(boolean z, int i) {
        if (i == 1 || this.c != 1) {
            b();
            d(0);
        } else {
            int i2 = this.g;
            if (!z) {
                if (i2 != 1) {
                    if (i2 == 3) {
                        return 0;
                    }
                }
                return -1;
            }
            if (i2 != 2) {
                if (this.h == null) {
                    defpackage.epu epuVar = defpackage.epu.a;
                    boolean zE = e();
                    defpackage.epu epuVar2 = this.b;
                    ahvr.ci(epuVar2);
                    this.h = new defpackage.esd(new android.media.AudioManager.OnAudioFocusChangeListener() { // from class: esa
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i3) {
                            defpackage.esc escVar = this.a;
                            if (i3 == -3 || i3 == -2) {
                                if (i3 != -2 && !escVar.e()) {
                                    escVar.d(4);
                                    return;
                                } else {
                                    escVar.c(0);
                                    escVar.d(3);
                                    return;
                                }
                            }
                            if (i3 == -1) {
                                escVar.c(-1);
                                escVar.b();
                                escVar.d(1);
                            } else if (i3 != 1) {
                                defpackage.etr.f("AudioFocusManager", a.bj(i3, "Unknown focus change type: "));
                            } else {
                                escVar.d(2);
                                escVar.c(1);
                            }
                        }
                    }, this.f, epuVar2, zE);
                }
                int iM$1 = da$.ExternalSyntheticApiModelOutline1.m$1((android.media.AudioManager) this.e.eZ(), this.h.a());
                if (iM$1 != 1 && iM$1 != 2) {
                    d(1);
                    return -1;
                }
                d(2);
            }
        }
        return 1;
    }

    public final void b() {
        int i = this.g;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        da$.ExternalSyntheticApiModelOutline1.m((android.media.AudioManager) this.e.eZ(), this.h.a());
    }

    public final void c(int i) {
        defpackage.esb esbVar = this.a;
        if (esbVar != null) {
            ((defpackage.eyj) esbVar).f.j(33, i, 0).b();
        }
    }

    public final void d(int i) {
        if (this.g != i) {
            this.g = i;
            float f = i == 4 ? 0.2f : 1.0f;
            if (this.d != f) {
                this.d = f;
                defpackage.esb esbVar = this.a;
                if (esbVar != null) {
                    ((defpackage.eyj) esbVar).f.f(34);
                }
            }
        }
    }

    public final boolean e() {
        defpackage.epu epuVar = this.b;
        return epuVar != null && epuVar.b == 1;
    }
}
