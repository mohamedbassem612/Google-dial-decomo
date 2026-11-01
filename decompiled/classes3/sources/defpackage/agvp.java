package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agvp extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvp(long j, aoub aoubVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = j;
        this.c = aoubVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aoub, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            int i = this.a;
            aooc.af(obj);
            if (i == 0) {
                java.lang.Object obj2 = this.c;
                long j = this.b;
                this.a = 1;
                if (((defpackage.uoo) obj2).c.c(j, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        aolu aoluVar2 = aolu.a;
        int i2 = this.a;
        aooc.af(obj);
        if (i2 == 0) {
            long j2 = this.b;
            this.a = 1;
            if (aosv.j(j2, this) == aoluVar2) {
                return aoluVar2;
            }
        }
        ?? r6 = this.c;
        if (!r6.x()) {
            defpackage.agvq.a.c().k(ahrc.c()).l("com/google/apps/tiktok/coroutines/AndroidJobs", "crashOnFailureLogOnTimeout$<anonymous>", 58, "AndroidJobs.kt").E("Timeout exceeded waiting on crashOnFailureLogOnTimeout job. Waited %s millis. Allowing job %s to continue anyway.", this.b, (java.lang.Object) r6);
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [aoub, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid == 0) {
            return new defpackage.agvp(this.b, (aoub) this.c, aolnVar, 0);
        }
        return new defpackage.agvp((defpackage.uoo) this.c, this.b, aolnVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvp(defpackage.uoo uooVar, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = uooVar;
        this.b = j;
    }
}
