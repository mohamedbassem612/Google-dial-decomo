package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class owa implements oqb {
    private final /* synthetic */ int $cid;
    private final rlv a;

    public owa(rlv rlvVar, int i) {
        this.$cid = i;
        aooh.f(rlvVar, "loggingBindings");
        this.a = rlvVar;
    }

    public final defpackage.acky a(defpackage.aclc aclcVar) {
        if (this.$cid != 0) {
            android.content.Intent intent = (android.content.Intent) aclcVar.a.get(defpackage.ackw.b);
            if (intent == null || !aooh.n(intent.getAction(), "com.android.dialer.callrecording.disclosure.impl.growthkit.ACTION_SHOW_SETTINGS")) {
                return null;
            }
            this.a.o(rmx.nd);
            return new defpackage.acky(true, 1);
        }
        android.content.Intent intent2 = (android.content.Intent) aclcVar.a.get(defpackage.ackw.b);
        if (intent2 == null || !aooh.n(intent2.getAction(), "com.android.dialer.incall.answer.method.promo.growthkit.ACTION_SHOW_SETTINGS")) {
            return null;
        }
        this.a.o(rmx.Bl);
        return new defpackage.acky(true, 1);
    }

    public final void b(int i, defpackage.ackw ackwVar) {
        if (this.$cid != 0) {
            if (i == 2) {
                if (ackwVar == defpackage.ackw.b) {
                    this.a.o(rmx.ne);
                    return;
                } else {
                    if (ackwVar == defpackage.ackw.d) {
                        this.a.o(rmx.nf);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i == 2) {
            if (ackwVar == defpackage.ackw.b) {
                this.a.o(rmx.Bm);
            } else if (ackwVar == defpackage.ackw.d) {
                this.a.o(rmx.Bn);
            }
        }
    }

    public owa(rlv rlvVar, int i, byte[] bArr) {
        this.$cid = i;
        aooh.f(rlvVar, "loggingBindings");
        this.a = rlvVar;
    }
}
