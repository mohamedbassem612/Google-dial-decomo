package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wur {
    public static final aimz a = aimz.i("com/android/incallui/TelecomEventUiThreadBlockedTimer");
    public final java.util.Set b = new acc(0);
    public final ruc c;

    public wur(ruc rucVar) {
        this.c = rucVar;
    }

    public final void a(aenj aenjVar) {
        aenj aenjVar2 = ruc.V;
        if (!aenjVar2.equals(aenjVar)) {
            a(aenjVar2);
        }
        java.util.Set set = this.b;
        if (set.contains(aenjVar)) {
            return;
        }
        set.add(aenjVar);
        this.c.j(aenjVar);
        mni.cx(new defpackage.tbl(this, aenjVar, aazc.b(), 2));
    }
}
