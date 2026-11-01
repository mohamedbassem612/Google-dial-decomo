package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wis implements java.lang.Runnable {
    public final /* synthetic */ defpackage.wit a;
    public final /* synthetic */ char b;

    public /* synthetic */ wis(defpackage.wit witVar, char c) {
        this.a = witVar;
        this.b = c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.wit witVar = this.a;
        witVar.a(7);
        j$.util.Optional optionalEmpty = witVar.d;
        char c = this.b;
        defpackage.wir wirVar = new defpackage.wir(c, 1);
        if (true == optionalEmpty.isPresent()) {
            if (true != ((java.lang.Character) optionalEmpty.get()).equals(java.lang.Character.valueOf(wirVar.a))) {
                optionalEmpty = j$.util.Optional.empty();
            }
        }
        defpackage.vxc vxcVar = new defpackage.vxc(witVar, 15);
        if (true == optionalEmpty.isPresent()) {
            optionalEmpty.get();
            ((defpackage.wit) vxcVar.a).a(15);
        }
        j$.util.Optional optionalEmpty2 = witVar.d;
        defpackage.wir wirVar2 = new defpackage.wir(c, 0);
        if (true == optionalEmpty2.isPresent()) {
            if (true != ((java.lang.Character) optionalEmpty2.get()).equals(java.lang.Character.valueOf(wirVar2.a))) {
                optionalEmpty2 = j$.util.Optional.empty();
            }
        }
        if (optionalEmpty2.isPresent()) {
            witVar.a(26);
        }
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(((java.lang.Long) witVar.b.a()).longValue());
        for (defpackage.wiu wiuVar : witVar.c.values()) {
            long epochMilli = j$.time.Instant.now().toEpochMilli() - millis;
            long j = wiuVar.b;
            java.lang.String str = wiuVar.a;
            boolean z = str.length() == 1 && str.equals(java.lang.String.valueOf(c));
            if (epochMilli < j && z) {
                witVar.a(18);
            }
        }
        witVar.d = j$.util.Optional.of(java.lang.Character.valueOf(c));
    }
}
