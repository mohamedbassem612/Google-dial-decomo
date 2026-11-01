package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kvh implements defpackage.kfh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callrecording/impl/calllog/CallRecordingDataSource");
    public final defpackage.lbi b;
    public final defpackage.kvj c;
    public final defpackage.ajct d;
    public final defpackage.ajct e;
    public final java.util.concurrent.atomic.AtomicLong f = new java.util.concurrent.atomic.AtomicLong(0);
    public final java.util.HashSet g = new java.util.HashSet();
    public final defpackage.rsr h;

    public kvh(defpackage.lbi lbiVar, defpackage.kvj kvjVar, defpackage.rsr rsrVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2) {
        this.b = lbiVar;
        this.c = kvjVar;
        this.h = rsrVar;
        this.d = ajctVar;
        this.e = ajctVar2;
    }

    @Override // defpackage.kfh
    public final defpackage.aenj a() {
        return new defpackage.aenj("CallRecordingDataSource");
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq b(defpackage.kfj kfjVar) {
        defpackage.ajcq ajcqVarH;
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/calllog/CallRecordingDataSource", "fill", 81, "CallRecordingDataSource.java")).v("enter");
        this.g.clear();
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/calllog/CallRecordingDataSource", "handleInsertsAndUpdatesFromAnnotatedCallLog", 96, "CallRecordingDataSource.java")).v("enter");
        defpackage.kfk kfkVar = (defpackage.kfk) kfjVar;
        java.util.Map map = kfkVar.a;
        boolean zIsEmpty = map.isEmpty();
        java.util.Map map2 = kfkVar.b;
        if (zIsEmpty && map2.isEmpty()) {
            ajcqVarH = defpackage.ajcm.a;
        } else {
            j$.util.stream.Stream streamConcat = j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(map.entrySet()), j$.util.Collection.-EL.stream(map2.entrySet()));
            j$.util.stream.Collector collector = defpackage.aido.a;
            defpackage.aify aifyVar = (defpackage.aify) streamConcat.collect(collector);
            ajcqVarH = defpackage.ahrv.g(this.b.j((defpackage.aify) j$.util.Collection.-EL.stream(aifyVar).map(new kle(3)).filter(new jvr(11)).collect(collector))).h(new jss(aifyVar, 16), this.d);
        }
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(ajcqVarH);
        defpackage.kjs kjsVar = new defpackage.kjs(this, kfjVar, 3);
        defpackage.ajct ajctVar = this.d;
        return ahrvVarG.i(kjsVar, ajctVar).i(new defpackage.kjs(this, kfjVar, 4), ajctVar).i(new defpackage.kjs(this, kfjVar, 5), ajctVar);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq d() {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq e() {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/calllog/CallRecordingDataSource", "onSuccessfulFill", 211, "CallRecordingDataSource.java")).v("enter");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f;
        if (atomicLong.get() > 0) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/calllog/CallRecordingDataSource", "onSuccessfulFill", 215, "CallRecordingDataSource.java")).x("lastSyncedCallRecordingDataTimestamp %d", atomicLong.get());
            defpackage.kvj kvjVar = this.c;
            arrayList.add(kvjVar.c.p(kvjVar.d.bl(new jwe(atomicLong.get(), 2))));
        }
        java.util.HashSet hashSet = this.g;
        if (!hashSet.isEmpty()) {
            defpackage.kvj kvjVar2 = this.c;
            arrayList.add(kvjVar2.c.p(kvjVar2.d.bl(new defpackage.jsd(defpackage.aihd.o(hashSet), 8))));
        }
        return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.j(arrayList)), (byte[]) null).o(new defpackage.kve(0), this.d);
    }
}
