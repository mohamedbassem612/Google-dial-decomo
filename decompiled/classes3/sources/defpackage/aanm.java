package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aanm extends ylc implements defpackage.aann {
    public final defpackage.aanx a;

    public aanm(defpackage.aanx aanxVar) {
        super("com.google.android.gms.location.ILocationListener");
        this.a = aanxVar;
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 1) {
            android.location.Location location = (android.location.Location) yld.a(parcel, android.location.Location.CREATOR);
            yld.c(parcel);
            this.a.b().b(new defpackage.aaoc(this, location, 0));
        } else {
            if (i != 2) {
                return false;
            }
            a();
        }
        return true;
    }

    @Override // defpackage.aann
    public final void a() {
        this.a.b().b(new defpackage.aaoc(this, 2));
    }

    public aanm() {
        throw null;
    }
}
