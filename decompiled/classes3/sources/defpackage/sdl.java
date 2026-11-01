package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sdl {
    public final java.lang.String a;
    public final java.lang.String b;
    public final defpackage.scx c;
    public final j$.time.Instant d;

    public sdl(java.lang.String str, java.lang.String str2, defpackage.scx scxVar, j$.time.Instant instant) {
        aooh.f(str, "accountName");
        aooh.f(str2, "accountE164PhoneNumber");
        aooh.f(scxVar, "verificationStatus");
        aooh.f(instant, "timestamp");
        this.a = str;
        this.b = str2;
        this.c = scxVar;
        this.d = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sdl) {
            defpackage.sdl sdlVar = (defpackage.sdl) obj;
            if (aooh.n(this.a, sdlVar.a) && aooh.n(this.b, sdlVar.b) && this.c == sdlVar.c && aooh.n(this.d, sdlVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "WhitePagesDataEntity(accountName=" + this.a + ", accountE164PhoneNumber=" + this.b + ", verificationStatus=" + this.c + ", timestamp=" + this.d + ')';
    }
}
