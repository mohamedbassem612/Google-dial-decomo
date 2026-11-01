package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class odc extends aomh implements aonj {
    java.lang.Object a;
    int b;
    final /* synthetic */ j$.util.Optional c;
    final /* synthetic */ j$.util.Optional d;
    final /* synthetic */ amzg e;
    final /* synthetic */ android.content.Context f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odc(j$.util.Optional optional, j$.util.Optional optional2, amzg amzgVar, android.content.Context context, aoln aolnVar) {
        super(1, aolnVar);
        this.c = optional;
        this.d = optional2;
        this.e = amzgVar;
        this.f = context;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.odc(this.c, this.d, this.e, this.f, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        aolu aoluVar = aolu.a;
        if (this.b == 0) {
            aooc.af(obj);
            android.telecom.DisconnectCause disconnectCause = (android.telecom.DisconnectCause) aooh.q(this.c);
            if (disconnectCause != null && disconnectCause.getCode() == 1 && aooh.n(disconnectCause.getReason(), "CARRIER_ROAMING_SATELLITE_MODE")) {
                java.lang.String str = (java.lang.String) aooh.q(this.d);
                if (str == null) {
                    defpackage.odd.a.d().l("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteSOSProducerModule$Companion", "produceUseSatelliteMessagingDisconnectPrompt$<anonymous>", 165, "SatelliteSOSProducerModule.kt").v("Number should not be null.");
                } else {
                    ajcq ajcqVarD = this.e.d();
                    this.a = str;
                    this.b = 1;
                    java.lang.Object objD = aosv.D(ajcqVarD, this);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    obj2 = str;
                    obj = objD;
                }
            }
            return null;
        }
        obj2 = this.a;
        aooc.af(obj);
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (!bool.booleanValue()) {
            defpackage.odd.a.d().l("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteSOSProducerModule$Companion", "produceUseSatelliteMessagingDisconnectPrompt$<anonymous>", 172, "SatelliteSOSProducerModule.kt").v("Messages app not available. Will not show option to redirect to Messages.");
        }
        android.content.Context context = this.f;
        defpackage.mlt mltVar = defpackage.mlt.PROMPT_TYPE_USE_DUNE;
        java.lang.String string = context.getString(2132018341);
        java.lang.String string2 = context.getString(2132018339);
        aooh.e(string2, "getString(...)");
        java.lang.String string3 = bool.booleanValue() ? context.getString(2132018340) : context.getString(android.R.string.ok);
        defpackage.ocz oczVar = bool.booleanValue() ? new defpackage.ocz((java.lang.String) obj2, context) : null;
        java.lang.String string4 = context.getString(2132018339);
        aooh.e(string4, "getString(...)");
        return new defpackage.mls(mltVar, string4, string, string2, string3, null, oczVar);
    }
}
