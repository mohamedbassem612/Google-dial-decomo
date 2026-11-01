package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kvp implements defpackage.abyf {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    public final java.lang.Object b;
    private final java.lang.Object c;
    private final java.lang.Object d;
    private final java.lang.Object e;

    public kvp(ahey aheyVar, defpackage.oq oqVar, kaw kawVar, aw awVar, gpd gpdVar, int i) {
        this.$cid = i;
        aooh.f(awVar, "fragment");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.c = aheyVar;
        this.d = oqVar;
        this.e = kawVar;
        this.a = awVar;
        this.b = gpdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.abyf
    public final /* synthetic */ abya a(java.lang.Object obj) {
        defpackage.kiy kiyVar;
        java.lang.Object[] objArr = 0;
        if (this.$cid == 0) {
            kiu kiuVar = ((defpackage.klb) obj).a;
            kui kuiVar = kiuVar.E;
            if (kuiVar == null) {
                kuiVar = kui.a;
            }
            java.lang.String str = kuiVar.c;
            aooh.e(str, "getCallRecordingFilePath(...)");
            if (str.length() == 0) {
                return null;
            }
            defpackage.oq oqVar = (defpackage.oq) this.d;
            if (!oqVar.t(kiuVar)) {
                return null;
            }
            java.lang.Object obj2 = oqVar.a;
            if (obj2 == null) {
                throw new java.lang.IllegalStateException("Call recording is not available");
            }
            java.lang.String string = ((android.content.Context) ((kva) obj2).g.a).getString(2132017752);
            aooh.e(string, "getCallRecordingConversationHistoryEntryText(...)");
            long j = kiuVar.d;
            long j2 = kiuVar.e;
            kui kuiVar2 = kiuVar.E;
            if (kuiVar2 == null) {
                kuiVar2 = kui.a;
            }
            java.lang.String str2 = kuiVar2.c;
            aooh.e(str2, "getCallRecordingFilePath(...)");
            return new defpackage.kvn(string, j, j2, str2);
        }
        kiu kiuVar2 = ((defpackage.klb) obj).a;
        wxp wxpVar = kiuVar2.C;
        if (wxpVar == null) {
            wxpVar = wxp.a;
        }
        aooh.e(wxpVar, "getAtlasCallDetails(...)");
        wgu wguVar = kiuVar2.I;
        if (wguVar == null) {
            wguVar = wgu.a;
        }
        aooh.e(wguVar, "getXatuCallDetails(...)");
        j$.util.Optional optionalG = ((zjm) this.e).g();
        aooh.e(optionalG, "getFeature(...)");
        vqy vqyVar = (vqy) aooh.q(optionalG);
        j$.util.Optional optionalG2 = ((zjm) this.b).g();
        aooh.e(optionalG2, "getFeature(...)");
        defpackage.wye wyeVar = (defpackage.wye) aooh.q(optionalG2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (wguVar.e && vqyVar != null) {
            java.lang.CharSequence charSequenceA = vqyVar.a();
            aooh.e(charSequenceA, "callLogEntryText(...)");
            arrayList.add(charSequenceA);
        }
        if (wxpVar.e && wyeVar != null) {
            java.lang.CharSequence charSequenceE = wyeVar.c.e();
            aooh.e(charSequenceE, "textForCallLogEntry(...)");
            arrayList.add(charSequenceE);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        java.lang.String strCr = ajsz.cr(arrayList, ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62);
        if (wxpVar.g || wguVar.c) {
            j$.util.Optional optional = (j$.util.Optional) this.c;
            optional.isPresent();
            long j3 = kiuVar2.e;
            java.lang.String strD = defpackage.kon.d((android.content.Context) this.a, kiuVar2);
            aooh.e(strD, "getUniqueCallId(...)");
            abwd abwdVarP = ((gpd) this.d).a(kiuVar2, 1).p();
            aooh.e(abwdVarP, "build(...)");
            abwd abwdVar = abwdVarP;
            java.lang.Object objOrElseThrow = optional.orElseThrow();
            aooh.e(objOrElseThrow, "orElseThrow(...)");
            kiyVar = new defpackage.kiy(j3, strD, abwdVar, 0);
        } else {
            kiyVar = null;
        }
        return new defpackage.kix(strCr, kiyVar != null ? new defpackage.jln(kiyVar, 11, objArr == true ? 1 : 0) : null);
    }

    @Override // defpackage.abyf
    public final /* synthetic */ void b(android.view.View view, abya abyaVar) {
        if (this.$cid != 0) {
            defpackage.kix kixVar = (defpackage.kix) abyaVar;
            ((android.widget.TextView) view.findViewById(2131427872)).setText(kixVar != null ? kixVar.a : null);
            ((android.widget.ImageView) view.findViewById(2131427871)).setImageResource(2131231550);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131427873);
            android.view.View.OnClickListener onClickListener = kixVar != null ? kixVar.b : null;
            textView.setOnClickListener(onClickListener);
            textView.setVisibility(onClickListener != null ? 0 : 8);
            return;
        }
        defpackage.kvn kvnVar = (defpackage.kvn) abyaVar;
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131427878);
        textView2.setText(kvnVar != null ? kvnVar.a : null);
        textView2.setContentDescription(kvnVar != null ? kvnVar.a : null);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(2131427499);
        int childCount = viewGroup.getChildCount();
        if (kvnVar == null) {
            if (childCount > 0) {
                java.lang.Object obj = this.c;
                aooh.c(viewGroup);
                defpackage.hgz.f(defpackage.hgz.a((ahey) obj, viewGroup));
            }
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        if (childCount <= 0) {
            ahvr.f(view, defpackage.ieh.class, new defpackage.kiz(this, 3));
        }
        java.lang.Object obj2 = this.c;
        aooh.c(viewGroup);
        android.view.View viewA = defpackage.hgz.a((ahey) obj2, viewGroup);
        defpackage.heq heqVarL = defpackage.hhb.l(defpackage.iek.a.m());
        defpackage.heq heqVarT = defpackage.hgz.t(defpackage.ied.a.m());
        java.lang.String string = ((kaw) this.e).v(kvnVar.c).toString();
        aooh.e(string, "toString(...)");
        heqVarT.H(string);
        heqVarT.E(defpackage.iec.CALL_RECORDING);
        heqVarT.G(kvnVar.b);
        heqVarL.z(heqVarT.D());
        heqVarL.B();
        heqVarL.C();
        heqVarL.A();
        defpackage.hgz.c(viewA, heqVarL.y());
        defpackage.hgz.d(viewA, new defpackage.kvo(this));
    }

    public kvp(android.content.Context context, zjm zjmVar, zjm zjmVar2, gpd gpdVar, j$.util.Optional optional, int i) {
        this.$cid = i;
        aooh.f(context, "appContext");
        aooh.f(optional, "transcriptAudioFeedback");
        this.a = context;
        this.e = zjmVar;
        this.b = zjmVar2;
        this.d = gpdVar;
        this.c = optional;
    }
}
