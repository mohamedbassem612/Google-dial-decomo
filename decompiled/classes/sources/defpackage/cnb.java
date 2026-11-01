package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cnb {
    public final android.view.View a;
    public android.view.autofill.AutofillId b;
    public final defpackage.kaw c;

    public cnb(android.view.View view, defpackage.kaw kawVar) {
        this.a = view;
        this.c = kawVar;
        aa$.ExternalSyntheticApiModelOutline0.m(view, 1);
        java.lang.Object obj = new defpackage.kaw(aa$.ExternalSyntheticApiModelOutline0.m(view)).a;
        if (obj != null) {
            this.b = aa$.ExternalSyntheticApiModelOutline0.m(obj);
        } else {
            defpackage.cwh.b("Required value was null.");
            throw new defpackage.aoiq();
        }
    }
}
