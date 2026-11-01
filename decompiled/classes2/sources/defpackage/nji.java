package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nji {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/callaudio/DobbyCallAudioPreparer");
    public final android.media.AudioManager b;
    public final zmq c;
    public zmw d;
    public boolean e;
    private final aolr f;
    private final aoin g;

    public nji(android.media.AudioManager audioManager, zmq zmqVar, aolr aolrVar, aoin aoinVar) {
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aoinVar, "enableUnconditionalBluetoothUnmuteAfterScreening");
        this.b = audioManager;
        this.c = zmqVar;
        this.f = aolrVar;
        this.g = aoinVar;
    }

    public final java.lang.Object a(aoln aolnVar) {
        java.lang.Object objAj;
        j$.util.Optional optionalA = this.c.a();
        aooh.e(optionalA, "getCallAudioRoute(...)");
        zmw zmwVar = (zmw) aooh.q(optionalA);
        return (zmwVar != null && zmwVar == zmw.b && (objAj = aoov.aj(this.f, new defpackage.mhq(this, (aoln) null, 10), aolnVar)) == aolu.a) ? objAj : aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.njh njhVar;
        aolr aolrVar;
        defpackage.mhq mhqVar;
        if (aolnVar instanceof defpackage.njh) {
            njhVar = (defpackage.njh) aolnVar;
            int i = njhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                njhVar.c = i - Integer.MIN_VALUE;
            } else {
                njhVar = new defpackage.njh(this, aolnVar);
            }
        } else {
            njhVar = new defpackage.njh(this, aolnVar);
        }
        java.lang.Object obj = njhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = njhVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!((java.lang.Boolean) this.g.a()).booleanValue()) {
                j$.util.Optional optionalA = this.c.a();
                aooh.e(optionalA, "getCallAudioRoute(...)");
                zmw zmwVar = (zmw) aooh.q(optionalA);
                if (zmwVar != null && zmwVar == zmw.b) {
                    if (this.e) {
                        a.b().l("com/android/dialer/dobby/impl/service/callaudio/DobbyCallAudioPreparer", "unmuteBluetoothAudio", 98, "DobbyCallAudioPreparer.kt").v("unmuting bluetooth audio");
                        aolrVar = this.f;
                        mhqVar = new defpackage.mhq(this, (aoln) null, 11, (byte[]) null);
                        njhVar.c = 1;
                        if (aoov.aj(aolrVar, mhqVar, njhVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
            } else if (this.e) {
                a.b().l("com/android/dialer/dobby/impl/service/callaudio/DobbyCallAudioPreparer", "unmuteBluetoothAudio", 98, "DobbyCallAudioPreparer.kt").v("unmuting bluetooth audio");
                aolrVar = this.f;
                mhqVar = new defpackage.mhq(this, (aoln) null, 11, (byte[]) null);
                njhVar.c = 1;
                if (aoov.aj(aolrVar, mhqVar, njhVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(obj);
        this.e = false;
        return aojh.a;
    }

    public final void c() {
        zmw zmwVar = this.d;
        if (zmwVar != null) {
            a.b().l("com/android/dialer/dobby/impl/service/callaudio/DobbyCallAudioPreparer", "restoreAudioAfterScreening", 54, "DobbyCallAudioPreparer.kt").y("Restoring audio route after screening: %s", zmwVar);
            this.c.e(zmwVar);
            this.d = null;
        }
    }
}
