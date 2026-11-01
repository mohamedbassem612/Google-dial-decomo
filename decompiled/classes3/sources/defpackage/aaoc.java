package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaoc implements defpackage.aafd {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public aaoc(defpackage.ylo yloVar, aafe aafeVar, int i) {
        this.$cid = i;
        this.a = aafeVar;
        j$.util.Objects.requireNonNull(yloVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.aafd
    public final /* synthetic */ void a(java.lang.Object obj) {
        aafc aafcVar;
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.aano) obj).a((android.location.Location) this.a);
            return;
        }
        int i2 = 1;
        if (i == 1) {
            defpackage.uwk uwkVar = (defpackage.uwk) obj;
            defpackage.uss ussVar = uwkVar.b;
            ussVar.b.o(rmx.lQ);
            java.lang.Object obj2 = ussVar.e;
            java.lang.Object obj3 = ussVar.f;
            long j = uwkVar.a;
            defpackage.ulw ulwVar = (defpackage.ulw) obj3;
            ((agsm) obj2).g(ahvr.H(aiql.v((aify) j$.util.Collection.-EL.stream(((zzx) ulwVar.b).k().c()).map(new defpackage.uvi(obj3, j, i2)).collect(aido.a)), new defpackage.uev(obj3, 17), (java.util.concurrent.Executor) ulwVar.c), 5L, java.util.concurrent.TimeUnit.SECONDS);
            ((aafe) this.a).a();
            return;
        }
        boolean z = false;
        if (i == 2) {
            defpackage.aanx aanxVar = ((defpackage.aanm) this.a).a;
            synchronized (aanxVar) {
                aanxVar.b = false;
                aafcVar = aanxVar.a.a;
            }
            if (aafcVar != null) {
                aanxVar.c.j(aafcVar, 2441);
                return;
            }
            return;
        }
        aezh aezhVar = (aezh) obj;
        try {
            defpackage.aezb aezbVar = (defpackage.aezb) alad.B(defpackage.aezb.a, (byte[]) this.a, akzq.a);
            java.util.Iterator it = aezhVar.b.b.iterator();
            while (it.hasNext()) {
                if (((aezg) it.next()).a(aezbVar.b) && !z) {
                    aezhVar.a.a();
                    z = true;
                }
            }
        } catch (alaz unused) {
        }
    }

    public aaoc(defpackage.aanm aanmVar, android.location.Location location, int i) {
        this.$cid = i;
        this.a = location;
        j$.util.Objects.requireNonNull(aanmVar);
    }

    public aaoc(defpackage.aanm aanmVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aanmVar);
        this.a = aanmVar;
    }

    public aaoc(aatd aatdVar, byte[] bArr, int i) {
        this.$cid = i;
        this.a = bArr;
        j$.util.Objects.requireNonNull(aatdVar);
    }
}
