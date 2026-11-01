package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ajxi {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public ajxi(afjh afjhVar, defpackage.ahex ahexVar, afjq afjqVar) {
        this.c = ahexVar;
        this.b = afjqVar;
        j$.util.Objects.requireNonNull(afjhVar);
        this.a = afjhVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.nio.file.Path, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [j$.nio.file.Path, java.lang.Object] */
    public final void a() {
        ?? r0 = this.c;
        ?? r1 = this.b;
        try {
            j$.nio.file.attribute.FileTime fileTimeFrom = j$.nio.file.attribute.FileTime.from(((ahea) this.a).e.plusMillis(android.os.SystemClock.elapsedRealtime()));
            aooh.e(fileTimeFrom, "from(...)");
            j$.nio.file.Path lastModifiedTime = j$.nio.file.Files.setLastModifiedTime((j$.nio.file.Path) r0, fileTimeFrom);
            aooh.e(lastModifiedTime, "setLastModifiedTime(...)");
            aooh.e(j$.nio.file.Files.move(lastModifiedTime, (j$.nio.file.Path) r1, (j$.nio.file.CopyOption[]) java.util.Arrays.copyOf(new j$.nio.file.CopyOption[0], 0)), "move(...)");
        } catch (java.io.IOException e) {
            ahea.a.c().k(e).l("com/google/apps/tiktok/experiments/phenotype/log/TimedProcessReaperLogger", "logSuccess", 227, "TimedProcessReaperLogger.kt").I("Could not finalize log file moving %s to %s", (java.lang.Object) r0, (java.lang.Object) r1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, tww] */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.txa txaVar;
        if (aolnVar instanceof defpackage.txa) {
            txaVar = (defpackage.txa) aolnVar;
            int i = txaVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                txaVar.b = i - Integer.MIN_VALUE;
            } else {
                txaVar = new defpackage.txa(this, aolnVar);
            }
        } else {
            txaVar = new defpackage.txa(this, aolnVar);
        }
        java.lang.Object obj = txaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = txaVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            java.lang.Object obj2 = this.c;
            roz rozVar = new roz((java.util.Collection) this.b, (defpackage.tww) this.a, (aoln) null, 19);
            txc txcVar = (txc) obj2;
            aosy aosyVarAg = ahvr.ag(txcVar.b, txcVar.g, rozVar);
            txaVar.b = 1;
            if (aosyVarAg.a(txaVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public /* synthetic */ ajxi(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ajxi(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, byte[] bArr) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public ajxi(txc txcVar, java.util.Collection collection, defpackage.tww twwVar) {
        this.c = txcVar;
        this.b = collection;
        this.a = twwVar;
    }

    public /* synthetic */ ajxi(com.google.firebase.messaging.FirebaseMessaging firebaseMessaging, java.lang.String str, ajxs ajxsVar) {
        this.a = firebaseMessaging;
        this.b = str;
        this.c = ajxsVar;
    }

    public ajxi(defpackage.rhd rhdVar, android.widget.TextView textView, defpackage.rgr rgrVar) {
        this.a = textView;
        this.c = rgrVar;
        j$.util.Objects.requireNonNull(rhdVar);
        this.b = rhdVar;
    }

    public ajxi(defpackage.yna ynaVar, defpackage.ymk ymkVar, defpackage.ync yncVar) {
        this.c = ymkVar;
        this.b = yncVar;
        j$.util.Objects.requireNonNull(ynaVar);
        this.a = ynaVar;
    }
}
