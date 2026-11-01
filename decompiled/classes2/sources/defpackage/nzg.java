package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nzg {
    public static final aimz a = aimz.i("com/android/dialer/eligibilityexpansion/EligibilityExpansionDatabase");
    private static final ahbq f;
    public final ajct b;
    public final ajct c;
    public final zzx d;
    public final aogc e;

    static {
        afib afibVar = new afib();
        afibVar.a("CREATE TABLE eligibility_expansion (phone_number TEXT PRIMARY KEY, eligibility_details BLOB NOT NULL)");
        f = afibVar.b();
    }

    public nzg(aogc aogcVar, ajct ajctVar, ajct ajctVar2, aogc aogcVar2) {
        this.d = aogcVar.aB("eligibility_expansion", f);
        this.b = ajctVar;
        this.c = ajctVar2;
        this.e = aogcVar2;
    }

    public final ajcq a() {
        return ahvr.H(this.e.bk(), new lix(17), this.b);
    }
}
