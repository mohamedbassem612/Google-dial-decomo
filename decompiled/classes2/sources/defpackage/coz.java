package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class coz {
    public static final defpackage.coz a = new defpackage.coz();
    public static final defpackage.coz b = new defpackage.coz();
    public static final defpackage.coz c = new defpackage.coz();
    public final cfc d = new cfc(new cpc[16]);

    public final void a() {
        if (this == a) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == b) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        cfc cfcVar = this.d;
        int i = cfcVar.b;
        if (i == 0) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        java.lang.Object[] objArr = cfcVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            cpc cpcVar = (cpc) objArr[i2];
            if (!cpcVar.L().D) {
                cwh.d("visitChildren called on an unattached node");
            }
            cfc cfcVar2 = new cfc(new cmv[16]);
            cmv cmvVar = cpcVar.L().x;
            if (cmvVar == null) {
                cfo.F(cfcVar2, cpcVar.L());
            } else {
                cfcVar2.n(cmvVar);
            }
            while (true) {
                int i3 = cfcVar2.b;
                if (i3 == 0) {
                    break;
                }
                cmv cmvVarX = (cmv) cfcVar2.c(i3 - 1);
                if ((cmvVarX.v & 1024) == 0) {
                    cfo.F(cfcVar2, cmvVarX);
                } else {
                    while (cmvVarX != null) {
                        if ((cmvVarX.u & 1024) != 0) {
                            cfc cfcVar3 = null;
                            while (cmvVarX != null) {
                                if (cmvVarX instanceof cpg) {
                                    if (((cpg) cmvVarX).i(7)) {
                                        break;
                                    }
                                } else if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof dap)) {
                                    int i4 = 0;
                                    for (cmv cmvVar2 = ((dap) cmvVarX).F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
                                        if ((cmvVar2.u & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                cmvVarX = cmvVar2;
                                            } else {
                                                if (cfcVar3 == null) {
                                                    cfcVar3 = new cfc(new cmv[16]);
                                                }
                                                if (cmvVarX != null) {
                                                    cfcVar3.n(cmvVarX);
                                                }
                                                cfcVar3.n(cmvVar2);
                                                cmvVarX = null;
                                            }
                                        }
                                    }
                                    if (i4 != 1) {
                                    }
                                }
                                cmvVarX = cfo.x(cfcVar3);
                            }
                            break;
                        }
                        cmvVarX = cmvVarX.x;
                    }
                }
            }
        }
    }
}
