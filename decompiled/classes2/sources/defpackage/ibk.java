package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ibk {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer");
    public final defpackage.hyv b;
    public final ajct c;
    public final ajcu d;
    public final aoin e;
    public final zms f;
    public final rlv g;
    public final defpackage.hgw m;
    public final ajwr l = new ajwr();
    public j$.util.Optional h = j$.util.Optional.empty();
    public j$.util.Optional i = j$.util.Optional.empty();
    public j$.util.Optional j = j$.util.Optional.empty();
    public final zmp k = new defpackage.ibp(this, 1);

    public ibk(ajcu ajcuVar, aoin aoinVar, ajcu ajcuVar2, defpackage.hyv hyvVar, defpackage.hgw hgwVar, zms zmsVar, rlv rlvVar) {
        this.c = ajcuVar;
        this.e = aoinVar;
        this.d = ajcuVar2;
        this.b = hyvVar;
        this.m = hgwVar;
        this.f = zmsVar;
        this.g = rlvVar;
    }

    public final ajcq a(final defpackage.hxe hxeVar, final boolean z, final boolean z2) {
        a.b().l("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer", "endCurrentPlayback", 156, "CallAudioPlayer.java").v("endCurrentPlayback");
        ahrv ahrvVarG = ahrv.g(ahvr.E(new defpackage.ioi(this, 1), this.c));
        long jLongValue = ((java.lang.Long) this.e.a()).longValue();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        ajcu ajcuVar = this.d;
        return ahrvVarG.j(jLongValue, timeUnit, ajcuVar).e(java.util.concurrent.TimeoutException.class, new defpackage.hup(hxeVar, 6), ajcuVar).h(new ahyc() { // from class: ibh
            public final java.lang.Object apply(java.lang.Object obj) {
                defpackage.ibk ibkVar = this.a;
                ibkVar.i = j$.util.Optional.empty();
                j$.util.Optional optional = ibkVar.h;
                defpackage.ibj ibjVar = new defpackage.ibj(ibkVar, hxeVar, z, z2);
                if (true == optional.isPresent()) {
                    java.lang.Object obj2 = optional.get();
                    defpackage.ibk ibkVar2 = ibjVar.a;
                    defpackage.hxe hxeVar2 = ibjVar.b;
                    boolean z3 = ibjVar.c;
                    boolean z4 = ibjVar.d;
                    ((dsd) obj2).b(hxeVar2);
                    if (z3) {
                        defpackage.ibk.a.b().l("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer", "endCurrentPlayback", 193, "CallAudioPlayer.java").y("completer set to %s where it shouldn't be", hxeVar2);
                    }
                    if (z4 && hxeVar2.equals(defpackage.hxe.b)) {
                        ibkVar2.g.o(rmx.wc);
                    }
                }
                ibkVar.h = j$.util.Optional.empty();
                ibkVar.j = j$.util.Optional.empty();
                return null;
            }
        }, ajcuVar);
    }
}
