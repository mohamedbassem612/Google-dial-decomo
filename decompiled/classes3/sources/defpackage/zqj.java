package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zqj {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final android.telecom.Call g;
    public final oko h;
    public j$.util.Optional i = j$.util.Optional.empty();
    public final zog j = new les(this, 17);
    public final defpackage.znc k = new defpackage.pte(this, 4);
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final ajct p;
    private final zrw q;

    public zqj(ajct ajctVar, android.telecom.Call call, zrw zrwVar, oko okoVar) {
        this.p = ajctVar;
        this.g = call;
        this.q = zrwVar;
        this.h = okoVar;
    }

    private static boolean b(android.telecom.Call call) {
        return android.telecom.VideoProfile.isVideo(call.getDetails().getVideoState());
    }

    private static boolean c(android.telecom.Call call) {
        if (call.getState() != 4) {
            return false;
        }
        return call.getDetails().hasProperty(8);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0090 A[DONT_INVERT, PHI: r5
      0x0090: PHI (r5v5 int) = (r5v4 int), (r5v3 int) binds: [B:30:0x008e, B:27:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    public final void a() {
        boolean z;
        int i = 0;
        boolean z2 = true;
        this.l = this.l || c(this.g);
        android.telecom.Call call = this.g;
        if (c(call) && !this.i.isPresent()) {
            this.i = j$.util.Optional.of(java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
        }
        if (this.m) {
            z = true;
        } else {
            if (call.getState() == 4 && call.getDetails().getExtras() != null) {
                int i2 = call.getDetails().getExtras().getInt("android.telecom.extra.AUDIO_CODEC", 0);
                if (android.os.Build.VERSION.SDK_INT != 30) {
                    android.os.Bundle extras = call.getDetails().getExtras();
                    int i3 = extras.getInt("android.telecom.extra.AUDIO_CODEC", 0);
                    float fAbs = java.lang.Math.abs(extras.getFloat("android.telecom.extra.AUDIO_CODEC_BITRATE_KBPS", 0.0f) - 24.4f);
                    if (i3 == 19) {
                        if (fAbs >= 0.01f) {
                            if (i3 != 20) {
                            }
                        }
                    } else if (i3 == 18) {
                        i3 = 18;
                        if (fAbs >= 0.01f) {
                            if (i3 != 20) {
                            }
                        }
                    } else if (i3 != 20) {
                    }
                    z = true;
                } else if (i2 == 19 || i2 == 20) {
                    z = true;
                }
            }
            z = false;
        }
        this.m = z;
        this.b = this.b || call.getDetails().hasProperty(1024);
        this.c = this.c || b(call);
        this.d = this.d || (b(call) && call.getDetails().hasProperty(1));
        this.n = this.n || (call.getState() == 4 && call.getDetails().hasProperty(16384));
        this.o = this.o || (b(call) && c(call));
        if (!this.e && !call.getDetails().hasProperty(1)) {
            z2 = false;
        }
        this.e = z2;
        if (this.a || call.getState() != 4) {
            return;
        }
        agsm.i(1236, ahvr.H(this.q.d(), new defpackage.zqi(this, i), this.p), "Unable to gather LTE info from call", new java.lang.Object[0]);
    }
}
