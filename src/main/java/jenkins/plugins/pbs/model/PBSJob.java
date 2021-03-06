/*
 * The MIT License
 *
 * Copyright (c) <2012-2013> <Bruno P. Kinoshita>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package jenkins.plugins.pbs.model;

import java.io.Serializable;

import hudson.model.ModelObject;

/**
 * Represents a PBS Job submitted to the server. Used to
 * get the output and error of the job.
 * @since 0.1
 */
public class PBSJob implements ModelObject, Serializable {

	private static final long serialVersionUID = -7088755514985506044L;
	private final String jobId;
	private final String out;
	private final String err;

	public PBSJob(String jobId, String out, String err) {
		super();
		this.jobId = jobId;
		this.out = out;
		this.err = err;
	}
	
	public String getJobId() {
		return jobId;
	}

	public String getOut() {
		return out;
	}

	public String getErr() {
		return err;
	}

	public String getDisplayName() {
		return "PBS Job " + jobId;
	}

}
