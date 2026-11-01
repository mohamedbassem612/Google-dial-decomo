package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class mlf implements agtk {
    final /* synthetic */ defpackage.mli a;

    public mlf(defpackage.mli mliVar) {
        j$.util.Objects.requireNonNull(mliVar);
        this.a = mliVar;
    }

    private final void d(int i) {
        akzx akzxVarM = defpackage.mix.a.m();
        akzxVarM.u();
        defpackage.mix mixVar = (defpackage.mix) akzxVarM.b;
        mixVar.b |= 1;
        mixVar.c = i;
        defpackage.mix mixVar2 = (defpackage.mix) akzxVarM.p();
        defpackage.mkx mkxVar = new defpackage.mkx();
        amxr.g(mkxVar);
        ahgl.b(mkxVar, mixVar2);
        mkxVar.r(this.a.g.I(), "precall_dialpad_error_dialog");
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.mli.a.c(), "failed to call a voicemail", "com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer$3", "onFailure", (char) 713, "PreCallDialpadFragmentPeer.java", th, zct.b);
    }

    public final /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        int iAM = a.aM(((com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto) obj2).a(defpackage.mjh.a, akzq.a()).c);
        if (iAM == 0) {
            iAM = 1;
        }
        int i = iAM - 1;
        if (i == 1) {
            ahvr.i(new defpackage.mko(), this.a.g);
        } else if (i == 2) {
            d(2132018319);
        } else {
            if (i != 3) {
                throw new java.lang.IllegalStateException("invalid voicemail result.");
            }
            d(2132018320);
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
