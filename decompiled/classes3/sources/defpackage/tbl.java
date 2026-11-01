package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tbl implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public tbl(anwl anwlVar, long j, java.lang.String str, int i) {
        this.$cid = i;
        this.a = j;
        this.c = str;
        j$.util.Objects.requireNonNull(anwlVar);
        this.b = anwlVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            ((tbm) this.b).b.put(java.lang.Long.valueOf(this.a), this.c);
            return;
        }
        if (i == 1) {
            long j = this.a;
            java.lang.Object obj = this.b;
            java.lang.Long lValueOf = java.lang.Long.valueOf(j);
            ?? r0 = ((kgl) obj).d;
            if (!r0.containsKey(lValueOf)) {
                r0.put(lValueOf, new acc(0));
            }
            ((java.util.Set) r0.get(lValueOf)).add(this.c);
            return;
        }
        if (i == 2) {
            defpackage.wur wurVar = (defpackage.wur) this.b;
            ruc rucVar = wurVar.c;
            java.lang.Object obj2 = this.c;
            rucVar.m((aenj) obj2);
            wurVar.b.remove(obj2);
            defpackage.wur.a.b().l("com/android/incallui/TelecomEventUiThreadBlockedTimer", "onEvent", 59, "TelecomEventUiThreadBlockedTimer.java").F("%s blocked UI thread for %.2f ms", obj2, (aazc.b() - this.a) / 1000000.0f);
            return;
        }
        if (i == 3) {
            new defpackage.afjp((afjq) this.b, this.a, (amhl) this.c).start();
            return;
        }
        long j2 = this.a;
        long jAbs = java.lang.Math.abs(j2);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        long j3 = jAbs / 1000000000;
        long jAbs2 = java.lang.Math.abs(j2);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
        long j4 = jAbs2 % 1000000000;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (j2 < 0) {
            sb.append("ClientCall started after ");
            sb.append((java.lang.String) this.c);
            sb.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb.append("Deadline ");
            sb.append((java.lang.String) this.c);
            sb.append(" was exceeded after ");
        }
        sb.append(j3);
        sb.append(java.lang.String.format(java.util.Locale.US, ".%09d", java.lang.Long.valueOf(j4)));
        sb.append("s waiting for ");
        anwl anwlVar = (anwl) this.b;
        sb.append(anwlVar.b);
        anwlVar.d(anqw.e.f(sb.toString()), true);
    }

    public /* synthetic */ tbl(defpackage.wur wurVar, aenj aenjVar, long j, int i) {
        this.$cid = i;
        this.b = wurVar;
        this.c = aenjVar;
        this.a = j;
    }

    public /* synthetic */ tbl(java.lang.Object obj, long j, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
        this.c = obj2;
    }
}
