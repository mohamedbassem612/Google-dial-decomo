package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class sdj extends defpackage.gfj {
    public sdj(defpackage.sdk sdkVar) {
        j$.util.Objects.requireNonNull(sdkVar);
    }

    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR REPLACE INTO `white_pages_data` (`accountName`,`accountE164PhoneNumber`,`verificationStatus`,`timestamp`) VALUES (?,?,?,?)";
    }

    @Override // defpackage.gfj
    public final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        sdl sdlVar = (sdl) obj;
        ginVar.j(1, sdlVar.a);
        ginVar.j(2, sdlVar.b);
        scx scxVar = sdlVar.c;
        java.lang.String strName = scxVar != null ? scxVar.name() : null;
        if (strName == null) {
            ginVar.i(3);
        } else {
            ginVar.j(3, strName);
        }
        j$.time.Instant instant = sdlVar.d;
        java.lang.Long lValueOf = instant != null ? java.lang.Long.valueOf(instant.toEpochMilli()) : null;
        if (lValueOf == null) {
            ginVar.i(4);
        } else {
            ginVar.h(4, lValueOf.longValue());
        }
    }
}
